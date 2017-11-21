package sample;

import com.sun.org.apache.bcel.internal.generic.LADD;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;

import javafx.scene.layout.HBox;


import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable{

   @FXML
    Button insertarBtn,buscarBtn,generarBtn,eliminarBtn;
   @FXML
    TextField insertarTxt,buscarTxt,dimencionTxt;
   @FXML
    ComboBox menuCmb;
   @FXML
    HBox listaHbx;


    Cola cola = new Cola();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        menuCmb.getItems().addAll("Extraer", "Tamaño", "Vaciar");

        this.insertarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               // int dato = insertarTxt.getText();
               // inserta el valor en la cola con el numero que ingresa al usuario en el texfiel
                cola.insertar(Integer.parseInt( insertarTxt.getText()));

                HBox hBox = new HBox();
                Label label = new Label(insertarTxt.getText());
                Separator separator = new Separator();
                hBox.getChildren().add(label);
                hBox.getChildren().add(separator);

                listaHbx.getChildren().add(0,hBox);


            }
        });

        this.eliminarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //staHbx.getChildren().remove();
               // insertarTxt.clear();


            }
        });



        generarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                switch (menuCmb.getValue().toString()) {
                    case "extraer":


                        break;


                    case "Tamaño":

                        break;


                    case "Vaciar":
                        System.out.println("dato a borrar");



                        break;

                        default:
                            break;

                }

            }
        });

    }
}
