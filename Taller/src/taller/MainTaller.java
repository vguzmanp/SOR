/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import BD.InterfazBD;
import general.EstadoGeneral;
import general.Taller;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Pablo
 */
public class MainTaller extends Application {

    InterfazBD bd;
    public static Taller taller;
    public Stage stage;

    @Override
    public void start(Stage stage2) throws Exception {
        stage = stage2;
        bd = new InterfazBD("sor_taller");
        //System.out.println(bd.getPedidosActivos());
        taller = bd.getPrimerTaller();
        //bd.close();
        if (taller != null) //está pendiente o activado
        {
            if (taller.getEstado() == EstadoGeneral.PENDIENTE) //pendiente de activación
            {
                FXMLLoader loader = changeScene("tallerPendienteActivacion.fxml");
                stage.setTitle("Esperando código de aceptación");
                TallerPendienteActivacionController staticDataBox = (TallerPendienteActivacionController) loader.getController();
                staticDataBox.setStage(stage);
                staticDataBox.showStage();
            } else if (taller.getEstado() == EstadoGeneral.ACTIVE) { //activo
                //Cargar GestionPedido
                //FXMLLoader loader = changeScene(".fxml");
                stage.setTitle("Gestión de pedidos");
                /*TallerPendienteActivacionController staticDataBox = (TallerPendienteActivacionController) loader.getController();
                 staticDataBox.setStage(stage);
                staticDataBox.showStage();*/
            } else { //baja
                //FXMLLoader loader = changeScene(".fxml");
                stage.setTitle("Estoy de baja no sé que hacer");
                /*TallerPendienteActivacionController staticDataBox = (TallerPendienteActivacionController) loader.getController();
                 staticDataBox.setStage(stage);
                 staticDataBox.showStage();*/
            }
        } else {
            FXMLLoader loader = changeScene("AltaTaller.fxml");
            stage.setTitle("Alta de taller");
            /*TallerPendienteActivacionController staticDataBox = (TallerPendienteActivacionController) loader.getController();
             staticDataBox.setStage(stage);
             staticDataBox.showStage();*/
            AltaTallerController staticDataBox = (AltaTallerController) loader.getController();
            staticDataBox.setStage(stage);
            staticDataBox.showStage();
        }
    }

    public FXMLLoader changeScene(String fxml) throws IOException {
        //Mostrar página de espera interfaz básica
        URL location = getClass().getResource(fxml);
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

    public Parent replaceSceneContent(String fxml) throws Exception {
        Parent page = (Parent) FXMLLoader.load(MainTaller.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();
        if (scene == null) {
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(page);
        }
        stage.sizeToScene();
        return page;
    }

    /**
     *
     */
    public void goToTallerPendienteActivacion() {
        try {
            replaceSceneContent("tallerPendienteActivacion.fxml");
        } catch (Exception ex) {
            Logger.getLogger(MainTaller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param n
     * @return
     */
    public static boolean validarNombre(String n) {
        
        Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z ]{0,21}");
        Matcher m = p.matcher(n);
        if (!m.matches()) {
            return false;
        }

        return true;
    }

    public static boolean validarDireccion(String dir) {
        return dir.length() < 22;
    }

    /**
     *
     * @param num
     * @return
     */
    public static boolean validarSoloNumeros(String num) {
        //Verificar que no se pase de 9 digitos!
        Pattern p = Pattern.compile("^[0-9]{0,7}[0-9]");
        Matcher m = p.matcher(num);
        if (!m.matches()) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param n
     * @return
     */
    public static boolean validarEmail(String n) {
        Pattern p = Pattern.compile("^(([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?))$");
        Matcher m = p.matcher(n);
        if (!m.matches()) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param nombreTaller
     * @param email
     * @param direccion
     * @param ciudad
     * @param cp
     * @param telefono
     * @return
     */
    public static boolean validar(String nombreTaller, String email, String direccion, String ciudad, String cp, String telefono) {
        return validarNombre(nombreTaller) && validarEmail(email) && validarNombre(ciudad) && validarSoloNumeros(cp) && validarSoloNumeros(telefono) && validarDireccion(direccion);
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

    public static int alta(java.lang.String name, java.lang.String email, java.lang.String address, java.lang.String city, int postalCode, int telephone) {
        gestor_taller.TallerWS_Service service = new gestor_taller.TallerWS_Service();
        gestor_taller.TallerWS port = service.getTallerWSPort();
        return port.alta(name, email, address, city, postalCode, telephone);
    }

    public static String activarTaller(java.lang.String mail) {
        gestor_taller.TallerWS_Service service = new gestor_taller.TallerWS_Service();
        gestor_taller.TallerWS port = service.getTallerWSPort();
        return port.activarTaller(mail);
    }

    public static Boolean envioNuevoPedido(java.lang.String id, java.lang.String name, java.lang.String email, java.lang.String address, java.lang.String city, int postalCode, int telephone) {
        gestor_taller.TallerWS_Service service = new gestor_taller.TallerWS_Service();
        gestor_taller.TallerWS port = service.getTallerWSPort();
        return port.envioNuevoPedido(id, name, email, address, city, postalCode, telephone);
    }
}
