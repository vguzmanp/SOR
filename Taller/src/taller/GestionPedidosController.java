/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller;

import general.Oferta;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pablovm1990
 */
public class GestionPedidosController implements Initializable {

    Stage thisStage;
    ArrayList<Oferta> ofertas;

    @FXML
    Button btNuevoPedido;
    public TextField tfIDPedido;
    public TextField tfIDPieza;
    public TextField tfLimiteDia;
    public TextField tfLimiteMes;
    public TextField tfLimiteAnyo;
    public ComboBox cbEstado;
    public ComboBox cbModo;
    public TableView tvGrid;
    public Button btBuscarPedido;
    
    /* PIEZAS */
    
    public TextField tfNombrePieza;
    public ComboBox cbTipoPiezas;
    public ComboBox cbEstadoPiezas;
    public Button btNuevaPieza;
    public Button btBuscarPieza;
    
    /* OFERTAS */
    public TextField tfIDPedidoOferta;
    public TextField tfIDCliente;
    public TextField tfIDPiezaOferta;
    public TextField tfNombreCliente;
    public TextField tfApellidos;
    public ComboBox cbEstadoOfertas;
    public TextField tfOfertasDia;
    public TextField tfOfertasMes;
    public TextField tfOfertasAnyo;

    public Button btAceptarOferta;
    public Button btRechazarOferta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void onClickNuevoPedido(ActionEvent e) throws IOException, Exception {
        URL location = getClass().getResource("NuevoPedido.fxml");
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        Parent root = FXMLLoader.load(NuevoPedidoController.class.getResource("NuevoPedido.fxml"));
        loader.load(location.openStream());
        stage.setScene(new Scene(root));
        stage.setTitle("Nuevo pedido");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node) e.getSource()).getScene().getWindow());
        NuevoPedidoController np = (NuevoPedidoController) loader.getController();
        np.setStage(stage);
        np.showStage();
        /* Pedido nuevoP = new Pedido(1001, "", new Date());
         Gson gson = new GsonBuilder().setDateFormat("MMM dd, yyyy hh:mm:ss a").create();
        String listaJSON = gson.toJson(nuevoP);
        MainTaller.nuevoPedido(listaJSON);*/
    }

    public void buscarPedido(ActionEvent e) {
        Date fechaLimite = new Date(Integer.parseInt(tfLimiteAnyo.getText().toString()), Integer.parseInt(tfLimiteMes.getText().toString()), Integer.parseInt(tfLimiteDia.getText().toString()));
        System.out.println(MainTaller.buscarPedidos(tfIDPedido.getText(), tfIDPieza.getText(), cbEstado.getValue().toString(), fechaLimite, cbModo.getValue().toString()));

    }

    public void buscarOfertas() {

    }

    public void buscarPieza() {

    }

    public void eliminarPedido(ActionEvent e) {

    }

    public void setStage(Stage stage) {
        thisStage = stage;
    }

    public void showStage() {
        thisStage.sizeToScene();
        thisStage.show();
    }

    public void aceptarOferta() {
        //comprobar si hay alguna oferta seleccionada

    }

    public void rechazarOferta() {
        //comprobar si hay alguna oferta seleccionada

    }

    public void actualizarOfertas() {
        ofertas = MainTaller.actualizarOfertas();
    }
}
