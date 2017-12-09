package application;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollToEvent;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class Controller2 implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField textField;
    @FXML
    private Circle circle;
    @FXML
    private Slider slider;
    
    @FXML
    private void handle(ActionEvent event) {
    	label.setText("Hello, " + textField.getText() + "!");
    	String str = String.valueOf(slider.getValue());
    	label.setText(str);
    	
    }
    
    
	@FXML
    private void getOnTouchMoved(MouseEvent mevent){
    	//String str2 = String.valueOf(slider.getValue());
    	circle.radiusProperty().bind(slider.valueProperty());
    }

	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		
	}
}