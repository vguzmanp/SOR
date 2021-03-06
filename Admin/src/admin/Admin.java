/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package admin;


import gestor_admin.AdminWS;
import general.Taller;
import jUDDI.JUDDIProxy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;





import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import seguridad.SslConfig;
import BD.InterfazBD;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;/*
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;*/

/**
 *
 * @author Cute
 */
public class Admin extends Application {
	   private ScheduledExecutorService scheduler;
	   public static Stage stage;
	   
	   public static EstadoGestor gestor1 = EstadoGestor.Activo;
	   public static EstadoGestor gestor2 = EstadoGestor.Activo;
	   public static EstadoGestor gestor3 = EstadoGestor.Activo;
	   
	   public static int timeout = 1000;
	   
	   static Bully bullyAlg;
	   
    static String getOfertasporPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void start(Stage stage2) throws Exception {
    	JUDDIProxy.loadWsdl("AdminWS");
    	 stage = stage2;
        FXMLLoader loader = changeScene("FXMLDocument.fxml");
        stage.setTitle("Admin");
        FXMLDocumentController staticDataBox = (FXMLDocumentController) loader.getController();
        staticDataBox.setStage(stage);
        staticDataBox.showStage();
        bullyAlg = new Bully();
        scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(bullyAlg, 2, 3, TimeUnit.SECONDS);
    }
    
    public static FXMLLoader changeScene(String fxml) throws IOException {
        URL location = Admin.class.getResource(fxml);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(location);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        Parent page = (Parent) loader.load(location.openStream());
        if (stage.getScene() == null) {
            Scene scene = new Scene(page);
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(page);
            stage.sizeToScene();
        }

        return loader;

    }


    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static String getOfertas() {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getOfertas();
    }

	private static AdminWS prepararWebService() {
		SslConfig.disableCertificateChecking();
		gestor_admin.AdminWS_Service service;
		try {
			service = new gestor_admin.AdminWS_Service(new URL("http://localhost:8080/Gestor/services/AdminWSPort?wsdl"));
			gestor_admin.AdminWS port = service.getAdminWSPort();
			SslConfig.disableCNChecker(port);
			return port;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return null;
        
	}

    public static String getPedidos() {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getPedidos();
    }

    public static String getTalleres() {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getTalleres();
    }
    public static String getTalleresAceptados() {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getTalleresAceptados();
    }
    public static String getPedidoID(java.lang.String id) {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getPedidoID(id);
    }

    public static String getOfertasporPedido(java.lang.String idPedido) {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getOfertasporPedido(idPedido);
    }

    public static String getDesguacesAceptados() {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getDesguacesAceptados();
    }

    public static String getDesguaces() {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getDesguaces();
    }



    public static String getAltaTalleres() {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getAltaTalleres();
    }

    public static void darAccesoTaller(java.lang.String id) {
        gestor_admin.AdminWS port = prepararWebService();
        port.darAccesoTaller(id);
    }

    public static Boolean addAccesoDesguace(java.lang.String id) {
        gestor_admin.AdminWS port = prepararWebService();
        return port.addAccesoDesguace(id);
    }

    public static String getAltaDesguace() {
        gestor_admin.AdminWS port = prepararWebService();
        return port.getAltaDesguace();
    }
    
    public static boolean toggleAsimetrico(boolean on) {
        gestor_admin.AdminWS port = prepararWebService();
        return port.setCifradoAsimetrico(on);
    }
    
    public static boolean toggleSimetrico(boolean on) {
        gestor_admin.AdminWS port = prepararWebService();
        return port.setCifradoSimetrico(on);
    }

    public static String getContrasenyaPorTallerID(java.lang.String id) {
    	gestor_admin.AdminWS port = prepararWebService();
        return port.getContrasenyaPorTallerID(id);
    }
    public static String getContrasenyaPorDesguaceID(java.lang.String id) {
    	gestor_admin.AdminWS port = prepararWebService();
        return port.getContrasenyaPorDesguaceID(id);
    }
    
    public static String registrar(){
    	gestor_admin.AdminWS port = prepararWebService();
    	return port.registrar();
    }
}
