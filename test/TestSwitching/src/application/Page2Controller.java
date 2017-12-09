package application;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author takahara
 */
public class Page2Controller extends AnchorPane implements Initializable {
    
    /** ラベルに表示するテキスト */
    private final String labelText;
    
    /** ラベル */
    @FXML
    private Label label;
    
    /**
     * コンストラクタ
     * @param labelText 
     */
    public Page2Controller(String labelText) {
        this.labelText = labelText;
        
        loadFXML();
    }
    
    /**
     * FXMLのロード
     */
    private void loadFXML() {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("page2.fxml"));
        fxmlLoader.setRoot(this);
        
        // 自分自身をコントロールとして設定
        fxmlLoader.setController(this);
        
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText(labelText);
    }    
    
    /**
     * ボタンクリックアクション
     */
    @FXML
    protected void handleButtonAction() {
        Main.getInstance().sendPage1Controller("Page1です。");
    }
}