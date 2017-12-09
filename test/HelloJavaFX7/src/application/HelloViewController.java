package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloViewController implements Initializable {
    
	@FXML
    private VBox parentVBox;
	@FXML
    private AnchorPane anchorPane;
	@FXML
    private AnchorPane parentAnchorPane;
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
		
		this.anchorPane.getChildren().remove(Controller1);
		//this.parentVBox.setPrefSize(Region.USE_COMPUTED_SIZE,Region.USE_COMPUTED_SIZE);
//		this.label.setText(
//				"Height:"+String.valueOf(this.parentVBox.getHeight())+
//				" Width:"+String.valueOf(this.parentVBox.getWidth())
//				);
		
		button1.setOnAction((event) -> {
			if(FLAG==0){
				this.anchorPane.getChildren().remove(Controller2);
				this.anchorPane.getChildren().add(Controller1);
				//this.anchorPane.setPrefSize(0.0,0.0);
				this.anchorPane.getScene().getWindow().sizeToScene();
				this.anchorPane.setPrefSize(300.0,400.0);
//				this.label.setText(
//						"Height:"+String.valueOf(this.parentVBox.getHeight())+
//						" Width:"+String.valueOf(this.parentVBox.getWidth())
//						);
				FLAG++;
			}else{
				this.anchorPane.getChildren().remove(Controller1);
				
				this.anchorPane.getChildren().add(Controller2);
				//this.anchorPane.setPrefSize(0.0,0.0);
				this.anchorPane.getScene().getWindow().sizeToScene();
				this.anchorPane.setPrefSize(200.0,200.0);
//				this.label.setText(
//						"Height:"+String.valueOf(this.parentVBox.getHeight())+
//						" Width:"+String.valueOf(this.parentVBox.getWidth())
//						);
				FLAG--;
			}
		});
		
//		button2.setOnAction((event) -> {
//				action1(event);
//				//close(event);
//			});
	}
	
	@FXML
	protected void action1(ActionEvent event) {
		Stage parent = (Stage) ((Node) event.getTarget()).getScene().getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Frame.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root,500.0,560.0);
			stage.setScene(scene);
			stage.initOwner(parent);
			stage.setTitle("new window example");
			//stage.setScene(new Scene(FXMLLoader.load(Paths.get("Controller.fxml").toUri().toURL())));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void close(ActionEvent event){
	       ((Node)event.getSource()).getScene().getWindow().hide();
	    }
}