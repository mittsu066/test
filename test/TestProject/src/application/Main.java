package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {

		VBox root = FXMLLoader.load(getClass().getResource("FxmlSample.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Hello, World!");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
