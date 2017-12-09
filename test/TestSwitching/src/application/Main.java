package application;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author takahara
 */
public class Main extends Application {
    
    /**
     * Sample class instance
     */
    private static Main instance;
    
    /**
     * ステージ
     */
    private Stage stage;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // インスタンス
        instance = this;
        
        // ステージの設定
        stage = primaryStage;
        //stage.setWidth(800);
        //stage.setHeight(600);
        
        // ページ1に遷移
        sendPage1Controller("Page1です。");
        
        // ステージの設定
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * Page1へ遷移する
     * @param labelText
     */
    public void sendPage1Controller(String labelText) {

        stage.setTitle("Page1");

        Page1Controller controller = new Page1Controller(labelText);
        this.replaceSceneContent(controller);
    }
    
    /**
     * Page1へ遷移する
     * @param labelText
     */
    public void sendPage2Controller(String labelText) {

        stage.setTitle("Page2");

        Page2Controller controller = new Page2Controller(labelText);
        this.replaceSceneContent(controller);
    }
    
    /**
     * シーンの変更
     * @param controller 
     */
    private void replaceSceneContent(Parent controller) {
        Scene scene = stage.getScene();
        if (scene == null) {
            scene = new Scene(controller);
            stage.setScene(scene);
        } else {
        	//controller.getScene().getWindow().sizeToScene();
            stage.getScene().setRoot(controller);
        }
        scene.getWindow().sizeToScene();
    }
    
    /**
     * Get Instance
     *
     * @return
     */
    public static Main getInstance() {
        return instance;
    }
    
}