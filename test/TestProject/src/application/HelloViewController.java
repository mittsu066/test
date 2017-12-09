package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import org.supercsv.cellprocessor.ConvertNullTo;
import org.supercsv.cellprocessor.FmtBool;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.CsvListWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import model.BandInfoDao;
import model.UserInfo;

public class HelloViewController implements Initializable {

	@FXML
	private TableView<UserInfo> tableView;
	@FXML
	private TableColumn<UserInfo, Integer> idTableColumn;
	@FXML
	private TableColumn<UserInfo, Integer> nameTableColumn;
	@FXML
	private TableColumn<UserInfo, Integer> surNameTableColumn;
	@FXML
	private TableColumn<UserInfo, Integer> userNameTableColumn;
	@FXML
	private TableColumn<UserInfo, Integer> passWordTableColumn;
	@FXML
	private TableColumn<UserInfo, Integer> ageTableColumn;
	@FXML
	private Button searchButton;
	@FXML
	private Button csvOutputButton;
	@FXML
	private Button closeButton;

	// private PrintWriter pw;
	private TableViewSelectionModel<UserInfo> selectionModel;

	@Override
	public void initialize(java.net.URL location, ResourceBundle rb) {

		this.idTableColumn.setCellValueFactory(new PropertyValueFactory<UserInfo, Integer>("id"));
		this.nameTableColumn.setCellValueFactory(new PropertyValueFactory<UserInfo, Integer>("name"));
		this.surNameTableColumn.setCellValueFactory(new PropertyValueFactory<UserInfo, Integer>("surName"));
		this.userNameTableColumn.setCellValueFactory(new PropertyValueFactory<UserInfo, Integer>("userName"));
		this.passWordTableColumn.setCellValueFactory(new PropertyValueFactory<UserInfo, Integer>("passWord"));
		this.ageTableColumn.setCellValueFactory(new PropertyValueFactory<UserInfo, Integer>("age"));

		BandInfoDao band_info_dao = new BandInfoDao();
		ObservableList<UserInfo> list = band_info_dao.getBandInfo();
		
		// テーブルにリストをセット
		this.tableView.setItems(list);
		// CSV書き出し
		this.csvOutputButton.setOnAction(event -> {
			try {
				// 出力先を作成する
				ICsvListWriter writer = new CsvListWriter(
						new FileWriter("/Users/mitsuru/Documents/OutputData.csv", false), // true追記、false上書きモード
						CsvPreference.STANDARD_PREFERENCE);
//				final CellProcessor[] processors = new CellProcessor[] { new UniqueHashCode(), new NotNull(),
//                        new NotNull(), new ConvertNullTo("no response", new FmtBool("yes", "no")), new Optional() };
				this.csvPrintWriter(writer);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public void csvPrintWriter(ICsvListWriter writer) {
		try {
			ObservableList<UserInfo> showingItems = this.tableView.getItems();
//			final CellProcessor[] processors = new CellProcessor[] { new UniqueHashCode(), new NotNull(),
//                    new NotNull(), new ConvertNullTo("no response", new FmtBool("yes", "no")), new Optional() };
			final String[] header = new String[] { "id", "name", "surName", "userName", "passWord", "age" };
			// write the header
			writer.writeHeader(header);
			
			for (UserInfo userInfo : showingItems) {
				System.out.println(userInfo.toString());
				// writer.print(userInfo);
				// writer.println("");
				writer.write(userInfo);
//				writer.write("");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}