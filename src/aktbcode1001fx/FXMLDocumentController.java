/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktbcode1001fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author aktbcode
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView HomeBtn, SettingsBtn, UserBtn;
    
    @FXML
    private AnchorPane TheMainPanel, HomePanel, SettingsPanel, UserPanel;
    
    @FXML
    public void handleCloseButtonAction(MouseEvent event){
        System.exit(0);
    }
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
        if (event.getTarget() == HomeBtn){
            TheMainPanel.setVisible(true);
            SettingsPanel.setVisible(false);
            HomePanel.setVisible(false);
        }
        else if(event.getTarget() == SettingsBtn){
            SettingsPanel.setVisible(true);
            TheMainPanel.setVisible(false);
            HomePanel.setVisible(false);
        }
        else if(event.getTarget() == UserBtn){
            TheMainPanel.setVisible(false);
            SettingsPanel.setVisible(false);
            HomePanel.setVisible(true);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}