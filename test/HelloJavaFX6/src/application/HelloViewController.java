package application;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
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
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class HelloViewController implements Initializable {
    
	@FXML
    private AnchorPane anchorPane;
	@FXML
    private Pane parentPane;
	@FXML
    private Node Controller1;
	@FXML
    private Node Controller2;
    @FXML
    private Label label;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    
    private int FLAG = 0;

	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		this.label.setText(
				"Height:"+String.valueOf(this.anchorPane.getHeight())+
				" Width:"+String.valueOf(this.anchorPane.getWidth())
				);
		
		this.anchorPane.getChildren().remove(Controller1);
		//this.parentPane.setPrefSize(500.0,600.0);
		
		//button1.setOnAction((event) -> {resizeBig();});
		//button2.setOnAction((event) -> {resizeBig();});
		
		
		button1.setOnAction((event) -> {
			if(FLAG==0){
				
				this.anchorPane.getChildren().remove(Controller2);
				this.anchorPane.getChildren().add(Controller1);
				this.parentPane.setPrefSize(500.0,800.0);
				this.label.setText(
						"Height:"+String.valueOf(this.parentPane.getHeight())+
						" Width:"+String.valueOf(this.parentPane.getWidth())
						);
				FLAG++;
			}else{
				this.anchorPane.getChildren().remove(Controller1);
				this.anchorPane.getChildren().add(Controller2);
				this.parentPane.setPrefSize(400.0,600.0);
				this.label.setText(
						"Height:"+String.valueOf(this.parentPane.getHeight())+
						" Width:"+String.valueOf(this.parentPane.getWidth())
						);
				FLAG--;
			}
		});
	}
}