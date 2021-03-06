package admin;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

import admin.Mensajes;
public class Bully implements Runnable  {
	ArrayList<InetAddress> gestores;
	int posicion;
	SocketServer skServer;
	InetAddress gestorPrincipal;
	static int NUM_REINTENTOS = 3;
	Boolean estarCaido;
	public Bully(){
		// Si es el proceso de identificador mas alto -> manda mensaje de coordinador a todos
		// else
		estarCaido=false;
		skServer = new SocketServer(5000);
		gestores= new ArrayList<InetAddress>(3);
		gestorPrincipal = null;
		try {
			gestores.add(InetAddress.getByName("172.20.41.134"));
			gestores.add(InetAddress.getByName("172.20.41.135"));
			gestores.add(InetAddress.getByName("172.20.41.140"));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		posicion=0;
		startElection();		
	}
	
	@Override
	public void run() {
		skServer.recibirPeticion();
		
		
		if(!pingGestor()){
			if(gestores.indexOf(gestorPrincipal)==posicion){
				FXMLDocumentController.cambiarEstadoGestor(EstadoGestor.Caido);
				estarCaido=true;
			}
			else{
				startElection();
			}
			
		}
		else{

		    if(estarCaido && gestores.indexOf(gestorPrincipal)==posicion){
				FXMLDocumentController.cambiarEstadoGestor(EstadoGestor.Activo);
				startElection();
				estarCaido=false;
			}

		}
		// TODO Auto-generated method stub
	}
	
	public boolean pingGestor() {
		// TODO hacer el ping y tal
		System.out.println("Ping a gestor");	
		
		SocketCliente sc = new SocketCliente();
		String mensaje = null;
		int cont=0;
		mensaje = sc.recieveMessage(gestorPrincipal.getHostAddress(), 5001);
		while(!mensaje.equals("OK") && cont<NUM_REINTENTOS){
			System.out.println("Reintento ping");
			mensaje = sc.recieveMessage(gestorPrincipal.getHostAddress(), 5001);
			cont++;
		}
		
		if(mensaje.equals("OK"))
			return true;
		else {
			if(gestorPrincipal.equals(gestores.get(posicion))){
				FXMLDocumentController.cambiarEstadoGestor(EstadoGestor.Caido);
			}
			return false;
		}
	}

	public void startElection(){

		System.out.println("Start election");
		FXMLDocumentController.cambiarEstadoGestor(EstadoGestor.Error);
		// envia mensaje de eleccion a los procesos con identificador mayor que el suyo
		for(int i=0;i<posicion;i++){
				sendMessage(Mensajes.eleccion,gestores.get(i));
		}
		Message msg=receiveMessage();
		if(msg.getMensaje() == Mensajes.error){
			iAmGestor();
		}else{
			if(msg.equals("respuesta")){
			}else{
				processMessage(msg.getMensaje(), msg.getIp());
			}
		} 
	}
	
	private void setGestor(InetAddress gestorIP) {
		// guarda el identificador y trata a ese proceso como nuevo coordinador
		gestorPrincipal = gestorIP;
		System.out.println(("El gestor es: " + gestorIP));
		FXMLDocumentController.cambiarEstadoGestor(EstadoGestor.Activo);
	}

	private Message receiveMessage(){
		//	Espera un tiempo determinado hasta recibir un mensaje. Si no lo recibe, lanza excepcion / devuelve null
		return skServer.recibirMensaje();
	}
	
	public void processMessage(Mensajes msg, InetAddress inetAddress){

		System.out.println("Procesar mensaje:"+ msg.toString() + " "+ inetAddress.getHostAddress());
		Boolean respuesta=false;
		if(msg==Mensajes.eleccion){
			FXMLDocumentController.cambiarEstadoGestor(EstadoGestor.Error);
			// startElection()
			for(int i=0;i<posicion;i++){
				if(sendMessage(msg,gestores.get(i))){
					respuesta=true;
				}
			}
			if(respuesta==false){
				sendMessage(Mensajes.respuesta,gestores.get(gestores.indexOf(inetAddress)));
				iAmGestor();
			}
		}
		else if (msg==Mensajes.coordinacion){
			setGestor(inetAddress);
			//cambiar gestor a otro
		}
		else{
			System.err.print("Error de mensaje");
		}
	}
	
	private boolean sendMessage(Mensajes msg, InetAddress inetAddress) {
		// TODO Auto-generated method stub
		SocketCliente sc = new SocketCliente();
		return sc.sendMessage(inetAddress.getHostAddress(), 5000, msg.toString());
	}

	private void iAmGestor(){
		//el proceso se erige como coordinador y envia mensaje de coordinador a todos los procesos con identificadores mas bajos
		gestorPrincipal = gestores.get(posicion);
		System.out.println(("Yo soy el gestor"));
		//decirle a uddi que yo soy el gestor
		for(int i=posicion+1; i<gestores.size(); i++){
			sendMessage(Mensajes.coordinacion, gestores.get(i));
		}
		FXMLDocumentController.soyElGestor();
		
		Admin.registrar();

	}
	
	/*
	
	// codigo copiapegado:
	public String bully = null;
	public int checkTimeout = -1;
	public int startTimeout = -1;
	public boolean enabled = true;
	public boolean gotBully() {
		return bully != null;
	}
	public String getBully() {
		return bully;
	}
	private boolean amIBiggerBully(String me, String other) {
		return me.compareTo(other) > 0;
	}

	public void execute() {
		if(checkTimeout > 0) {
			checkTimeout--;
		} else if(checkTimeout == 0) {
			checkTimeout = -1;
			// got no pong from the bully in time, restart election
			restart();
			startTimeout  = 60;
		} else {
			// no timeout
		}

		if(startTimeout > 0) {
			startTimeout--;
		} else if(startTimeout == 0) {
			startTimeout = -1;
			start();
		}

		//      // default action, check from time to time
		//      if(Math.random() < 0.01) {
		//              check();
		//      }
	}

	public void restart() {
		// reset 
		bully = null;
		// send everyone
		for(IUserLink l : getConnectedLinks()) {
			sendMy(new ElectionRestartPacket(getBullyId()), l, null);
		}
	}

	public void start() {
		//      restart();
		// set me as bully
		this.bully = getBullyId();
		// now propagate election packet
		for(IUserLink l : getConnectedLinks()) {
			sendMy(new ElectionPacket(getBullyId()), l, null);
		}
	}

	public void check() {
		if(gotBully()) {
			checkTimeout = 100;
			for(IUserLink l : getConnectedLinks()) {
				sendMy(new PingPacket(getBully(), getBullyId()), l, null);
			}
		} else {
			start();
		}
	}

	public void toggleEnabled() {
		enabled = !enabled;
	}

	private void sendMy(ABullyPacket p, IUserLink l, Integer hops) {
		long wait = (int)(Math.random()*2 + 0);
		if(enabled == false) {
			return;
		}
		if(hops != null) {
			p.setHops(hops-1);
		}
		if(p.getHops() > 0)
			send(p, l, wait);
		// timeouted
	}

	private void receive(PongPacket p) {
		// if i am the sender of the pong, fine
		if(p.getSenderId().equals(getBullyId())) {
			// fine, reset countdown
			checkTimeout = -1;
		} else {
			// forward pong
			for(IUserLink l : getConnectedLinks()) {
				if(!l.equals(p.getLinkToSource())) {
					sendMy(new PongPacket(p.getBullyId(), p.getSenderId()), l, p.getHops());
				}
			}
		}
	}

	private void receive(PingPacket p) {
		if(!gotBully() || !p.getBullyId().equals(getBully())) {
			// restart
			restart();
		} else {
			if(getBullyId().equals(p.getBullyId())) {
				// I am the bully, respond with pong
				sendMy(new PongPacket(getBully(), p.getSenderId()), p.getLinkToSource(), p.getMaxHops()-p.getHops());
			} else if(!p.getSenderId().equals(getBullyId())) {
				// propagate to everyone but sender
				for(IUserLink l : getConnectedLinks()) {
					if(!p.getLinkToSource().equals(l)) {
						sendMy(new PingPacket(p.getBullyId(), p.getSenderId()), l,p.getHops());
					}
				}
			}
		}
	}

	private void receive(ElectionRestartPacket p) {
		if(gotBully()) {
			// forward everyone but sender
			for(IUserLink l : getConnectedLinks()) {
				if(!l.equals(p.getLinkToSource())) {
					sendMy(new ElectionRestartPacket(getBullyId()), l, p.getHops());
				}
			}
		}
		// reset 
		bully = null;
	}

	private void propagateBully(String bully, IUserLink notToThisOne, Integer hops) {
		for(IUserLink l : getConnectedLinks()) {
			if(notToThisOne != null && !l.equals(notToThisOne)) {
				sendMy(new ElectionPacket(bully), l, hops);
			}
		}
	}

	private void receive(ElectionPacket p) {
		if(gotBully()) {
			if(p.getBullyId().equals(getBully())) {
				// do nothing, we have the same
			} else {
				// we already got a bully, see if the new one is bigger
				if(amIBiggerBully(getBully(), p.getBullyId())) {
					// the bully we have is bigger
					sendMy(new ElectionPacket(getBully()), p.getLinkToSource(), p.getHops());
				} else {
					// the bully we have is smaller, accept new bully
					bully = p.getBullyId();
					// forward everybody AND sender
					propagateBully(bully, p.getLinkToSource(), p.getHops());
				}
			}
		} else {
			// we have no bully
			if(amIBiggerBully(getBullyId(), p.getBullyId())) {
				// I am bigger, notify sender
				sendMy(new ElectionPacket(getBullyId()), p.getLinkToSource(), p.getHops());
				bully = getBullyId();
				// notify everybody else about my "victory"
				propagateBully(bully, p.getLinkToSource(), p.getHops());
			} else {
				// accept him
				bully = p.getBullyId();
				// I am smaller, propagate him
				propagateBully(bully, p.getLinkToSource(), p.getHops());
			}
		}
	}

	public void receive(IUserPacket packet) {
		if(enabled == false) {
			return;
		}
		if (packet instanceof ElectionRestartPacket) {
			receive((ElectionRestartPacket) packet);
		} else if (packet instanceof PingPacket) {
			receive((PingPacket) packet);
		} else if (packet instanceof ElectionPacket) {
			receive((ElectionPacket) packet);
		} else if (packet instanceof PongPacket) {
			receive((PongPacket) packet);
		} else {
			//          Logger
			//                  .output(LogLevel.ERROR, this,
					//                          "receive 'unknown' packet from "
					//                                  + packet.getSource());
		}
	}

	public String getBullyId() {
		return getId();
	}

	public boolean amIBully() {
		return gotBully() && bully.equals(getBullyId());
	}

	public ColorType getNodeColor() {
		if(!enabled)
			return ColorType.RED;
		else if(checkTimeout > 0)
			return ColorType.ORANGE_LIGHT;
		else if(startTimeout > 0)
			return ColorType.ORANGE;
		else if(amIBully())
			return ColorType.GREEN;
		else
			return ColorType.GREY;
	}

	public String getHeader1() {
		String out = getBullyId();
		return out;
	}

	public String getHeader2() {
		String out = "";
		if ( gotBully() ) {
			if(bully.equals(getBullyId()))
				out += "Bully=ME!";
			else {
				out+="Bully="+bully;
			}
		} else {
			out+="Bully=???";
		}
		if(checkTimeout > -1) {
			out+="-CHECK="+checkTimeout;
		}
		if(startTimeout > -1) {
			out+="-STARTIN="+startTimeout;
		}
		if(!enabled)
			out+="-DISABLED";
		return out;
	}
	*/

}
