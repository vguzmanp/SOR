/**
 * 
 */
package admin;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author pablovm1990
 *
 */
public class SocketCliente {
	//static final String HOST = "localhost"; 
	//static final int PUERTO=5000;
	
	public SocketCliente() {
		
	}
	
	public boolean sendMessage(String host, int puerto, String mensaje){
		try {
			Socket skCliente = new Socket(host, puerto);
			skCliente.setSoTimeout(Admin.timeout);
			OutputStream aux = skCliente.getOutputStream();
			DataOutputStream flujo = new DataOutputStream(aux);
			flujo.writeUTF(mensaje);
			skCliente.close();
			return true;
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println("Cliente: " + e.getMessage());
		}
		return false;
	}
	
	public String recieveMessage(String host, int puerto){
		try {
			Socket skCliente = new Socket(host, puerto);
			skCliente.setSoTimeout(Admin.timeout);
			InputStream aux = skCliente.getInputStream();
			DataInputStream flujo = new DataInputStream( aux );
			String mensaje = flujo.readUTF();
			skCliente.close();
			//System.out.println("Cliente: " + mensaje);
			return mensaje;
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println("Cliente: ERROR");
		}
		return "error";
	}
}
