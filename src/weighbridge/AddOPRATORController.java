/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weighbridge;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SaieeshNaik
 */
public class AddOPRATORController implements Initializable {

    @FXML
    private Button BTNADD;
    @FXML
    private Button RESET;
    @FXML
    private Button onback;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ONBTNADD(ActionEvent event) {
    }

    @FXML
    private void ONBTNRESET(ActionEvent event) {
    }

    @FXML
    private void onBackClicked(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
            Stage stage = (Stage) BTNADD.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
    }
    
}
