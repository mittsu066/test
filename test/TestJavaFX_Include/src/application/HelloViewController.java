package application;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloViewController implements Initializable {
	
	@FXML
    private TextField textField;
    @FXML
    private Label label;
    @FXML
    private VBox vbox;
    @FXML
    private HBox hbox;
    
    
    @FXML
    private void handle(ActionEvent event) {
    	label.setText("Hello, " + textField.getText() + "!");
    }

	@Override
	public void initialize(java.net.URL location, ResourceBundle rb) {
		// TODO Auto-generated method stub

		try{
		//this.hbox =  FXMLLoader.load(getClass().getResource("Include1.fxml"));  
		Node node = FXMLLoader.load(getClass().getResource("Include1.fxml"));
		this.vbox.getChildren().add(node);
		}catch(Exception e){
			
		}
	}
}