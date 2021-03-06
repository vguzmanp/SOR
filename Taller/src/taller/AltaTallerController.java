/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import BD.InterfazBD;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pablo
 */
public class AltaTallerController implements Initializable {

    Stage thisStage;
    InterfazBD bd;
    /**
     * Class Fxml variables
     */
    @FXML
    public TextField tfNombreTaller;
    public TextField tfEmail;
    public TextField tfDireccion;
    public TextField tfCiudad;
    public TextField tfCp;
    public TextField tfTelefono;
    public Label errorNombreTaller;
    public Label errorEmail;
    public Label errorDireccion;
    public Label errorCiudad;
    public Label errorCp;
    public Label errorTelefono;

    /**
     * Initializes the controller class.
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        assert tfNombreTaller != null : "fx:id=\"myButton\" was not injected: check your FXML file 'simple.fxml'.";
        /**
         *
         */
        tfNombreTaller.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
                if (!arg2) { //Code here the action when the object lose the focus
                    if (MainTaller.validarNombre(tfNombreTaller.getText())) {
                        tfNombreTaller.setStyle("-fx-border-color: green;");
                        errorNombreTaller.setText("");
                    } else {
                        //add errors in the interface
                        if (tfNombreTaller.getText().length() < 22) {
                            errorNombreTaller.setText("No pueden contener carácteres extraños, ni números");
                        } else if (tfNombreTaller.getText().isEmpty()) {
                            errorNombreTaller.setText("No puede ser vacio");
                        } else {
                            errorNombreTaller.setText("No más de 21 carácteres");
                        }

                        tfNombreTaller.setStyle("-fx-border-color: red;");
                    }
                }
            }
        });

        tfEmail.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
                if (!arg2) { //Code here the action when the object lose the focus
                    if (MainTaller.validarEmail(tfEmail.getText())) {
                        tfEmail.setStyle("-fx-border-color: green;");
                        errorEmail.setText("");
                    } else {
                        tfEmail.setStyle("-fx-border-color: red;");
                        //add errors in the interface
                        if (tfEmail.getText().isEmpty()) {
                            errorEmail.setText("No puede ser vacio");
                        } else {
                            errorEmail.setText("Email incorrecto");
                        }
                    }
                }
            }
        });

        tfCiudad.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
                if (!arg2) { //Code here the action when the object lose the focus
                    if (MainTaller.validarNombre(tfCiudad.getText())) {
                        tfCiudad.setStyle("-fx-border-color: green;");
                        errorCiudad.setText("");
                    } else {
                        tfCiudad.setStyle("-fx-border-color: red;");
                        //add errors in the interface
                        if (tfCiudad.getText().length() < 22) {
                            errorCiudad.setText("No pueden contener carácteres extraños, ni números");
                        } else if (tfCiudad.getText().isEmpty()) {
                            errorCiudad.setText("No puede ser vacio");
                        } else {
                            errorCiudad.setText("No más de 21 carácteres");
                        }
                    }
                }
            }
        });

        tfDireccion.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
                if (!arg2) { //Code here the action when the object lose the focus
                    if (MainTaller.validarDireccion(tfDireccion.getText())) {
                        tfDireccion.setStyle("-fx-border-color: green;");
                        errorDireccion.setText("");
                    } else {
                        tfDireccion.setStyle("-fx-border-color: red;");
                        //add errors in the interface
                        errorDireccion.setText("No más de 21 carácteres");
                    }
                }
            }
        });

        tfCp.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
                if (!arg2) { //Code here the action when the object lose the focus
                    if (MainTaller.validarSoloNumeros(tfCp.getText())) {
                        tfCp.setStyle("-fx-border-color: green;");
                        errorCp.setText("");
                    } else {
                        tfCp.setStyle("-fx-border-color: red;");
                        //add errors in the interface
                        if (tfCp.getText().length() >= 10) {
                            errorCp.setText("No más de 9 carácteres");
                        } else if (tfCp.getText().isEmpty()) {
                            errorCp.setText("No puede ser vacio");
                        } else {
                            errorCp.setText("Sólo añadir números");
                        }
                    }
                }
            }
        });

        tfTelefono.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
                if (!arg2) { //Code here the action when the object lose the focus
                    if (MainTaller.validarSoloNumeros(tfTelefono.getText())) {
                        tfTelefono.setStyle("-fx-border-color: green;");
                        errorTelefono.setText("");
                    } else {
                        tfTelefono.setStyle("-fx-border-color: red;");
                        //add errors in the interface
                        if (tfTelefono.getText().length() >= 10) {
                            errorTelefono.setText("No más de 9 carácteres");
                        } else if (tfTelefono.getText().isEmpty()) {
                            errorTelefono.setText("No puede ser vacio");
                        } else {
                            errorTelefono.setText("Sólo añadir números");
                        }
                    }
                }
            }
        });
    }

    public void setStage(Stage stage) {
        thisStage = stage;
    }

    public void showStage() {
        thisStage.sizeToScene();
        thisStage.show();
    }

    /**
     *
     * @param e
     */
    public void onClickCancel(ActionEvent e) {
        System.exit(0);
    }

    public void setEditableAllInputs(boolean b) {
        tfNombreTaller.setEditable(b);
        tfEmail.setEditable(b);
        tfDireccion.setEditable(b);
        tfCiudad.setEditable(b);
        tfCp.setEditable(b);
        tfTelefono.setEditable(b);
    }

    /**
     *
     * @param e
     * @throws java.io.IOException
     */
    @SuppressWarnings("empty-statement")
    public void onClickAceptar(ActionEvent e) throws IOException, Exception {
        //If the validation goes well
        //bloquear los inputs
        /*Pedido nuevoP = new Pedido(1, "", new Date());
        Gson g = new Gson();
        String listaJSON = g.toJson(nuevoP);
        MainTaller.nuevoPedido(listaJSON);*/
        setEditableAllInputs(false);
        if (MainTaller.validar(tfNombreTaller.getText(), tfEmail.getText(), tfDireccion.getText(), tfCiudad.getText(), tfCp.getText(), tfTelefono.getText())) {
            //then we can send the registration
            System.out.println("Enviando...");
            if (MainTaller.alta(tfNombreTaller.getText(), tfEmail.getText(), tfDireccion.getText(), tfCiudad.getText(),tfCp.getText(), tfTelefono.getText())) {
                //METER en base de datos si está todo ok.
                bd = new InterfazBD("sor_taller");
                if (bd.altaTaller(tfNombreTaller.getText(), tfEmail.getText(), tfDireccion.getText(), tfCiudad.getText(), Integer.parseInt(tfCp.getText()), Integer.parseInt(tfTelefono.getText()), 2) != -1) {
                    URL location = getClass().getResource("tallerPendienteActivacion.fxml");
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(location);
                    loader.setBuilderFactory(new JavaFXBuilderFactory());
                    Parent page = (Parent) loader.load(location.openStream());
                    thisStage.getScene().setRoot(page);
                    thisStage.setTitle("Esperando código de aceptación");
                    TallerPendienteActivacionController staticDataBox = (TallerPendienteActivacionController) loader.getController();
                    staticDataBox.setStage(thisStage);
                    staticDataBox.showStage();
                } else {
                    //devolver un error
                }
                bd.close();
            }
            else{
                System.err.println("alta me ha devuelto < 0");
            }
        }
        //else nothing
    }

    /**
     * Basicamente cambia a gestion pedido otra vez
     */
    public void irAGestionPedidos() throws IOException {
        URL location = getClass().getResource("GestionPedidos.fxml");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(location);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        Parent page = (Parent) loader.load(location.openStream());
        thisStage.getScene().setRoot(page);
        GestionPedidosController tdCont = (GestionPedidosController) loader.getController();
        tdCont.setStage(thisStage);
        tdCont.showStage();
    }

    public void modificarTaller() throws IOException {
        if (MainTaller.validar(tfNombreTaller.getText(), tfEmail.getText(), tfDireccion.getText(), tfCiudad.getText(), tfCp.getText(), tfTelefono.getText())) {
            System.out.println("Enviando...");
            if (MainTaller.modificarDatos(tfNombreTaller.getText(), tfEmail.getText(), tfDireccion.getText(), tfCiudad.getText(), tfCp.getText(), tfTelefono.getText()))
                irAGestionPedidos();
        }
    }
}
