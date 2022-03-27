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
public class MenuController implements Initializable {

    @FXML
    private Button BTN1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button BTN4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onbtn1clicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RegisterWeight.fxml"));
            Stage stage = (Stage) BTN1.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
    }

    @FXML
    private void onbtn2clicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("addOPRATOR.fxml"));
            Stage stage = (Stage) BTN1.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
    }

    @FXML
    private void onbtn3clicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Reports.fxml"));
            Stage stage = (Stage) BTN1.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
    }

    @FXML
    private void ONBACKCLCIKED(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
            Stage stage = (Stage) BTN1.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
    }
    
}
