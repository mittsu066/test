package application;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloViewController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField textField;
    
    @FXML
    private void handle(ActionEvent event) {
    	label.setText("Hello, " + textField.getText() + "!");
    }

	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}