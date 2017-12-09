package application;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FxmlSampleController implements Initializable {
    
    @FXML
    private Label Label;
    @FXML
    private TextField textField;
    
    @FXML
    private void handle(ActionEvent event) {
        Label.setText("Hello, " + textField.getText() + "!");
    }

	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}