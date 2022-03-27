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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author SaieeshNaik
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private Label label3;
    
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onbuttonSubmit(ActionEvent event) throws IOException {
        String userid = txt1.getText();
        String pass = txt2.getText();
        String uid="admin";
        String pwd="admin";
        if(userid.equals(uid) && pass.equals(pwd) ){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
            Stage stage = (Stage) btn1.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }else{
            label3.setText("Invalid login credentials");
        }
    }

    @FXML
    private void onButtonReset(ActionEvent event) {
        txt1.setText("");
        txt2.setText("");
        label3.setText("");
    }
    
}
