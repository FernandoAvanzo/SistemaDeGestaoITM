/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CGITmMain;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author User
 */
public class StartScreenController implements Initializable{
   
    @FXML
    private Label texto;
    
    @FXML
    private void teste(ActionEvent evento){
        System.out.println("teste01");
        texto.setText("testando o texto");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
}
