package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;

public class MainController implements Initializable{
	
	@FXML
	private TableView<MainTable> tableView;
	@FXML
	private TableColumn<MainTable,Boolean> checkBoxColumn;
	@FXML
	private TableColumn<MainTable,String> string1Column;
	@FXML
	private TableColumn<MainTable,String> string2Column;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		this.checkBoxColumn.setCellFactory(CheckBoxTableCell.forTableColumn(checkBoxColumn));//チェックボックスを配置
		this.checkBoxColumn.setCellValueFactory(cellData -> cellData.getValue().checkBoxProperty());//チェックボックスをモデルの値と連動させる
		
		this.string1Column.setCellValueFactory(cellData -> cellData.getValue().string1Property());
		this.string2Column.setCellValueFactory(cellData -> cellData.getValue().string2Property());
		
		ObservableList<MainTable> mainTable = FXCollections.observableArrayList();
		
		MainTable maintable1 = new MainTable();
		maintable1.setCheckBox(false);
		maintable1.setString1("1_test1");
		maintable1.setString2("1_test2");	
		mainTable.add(maintable1);
		
		MainTable maintable2 = new MainTable();
		maintable2.setCheckBox(false);
		maintable2.setString1("2_test1");
		maintable2.setString2("2_test2");	
		mainTable.add(maintable2);
		
		MainTable maintable3 = new MainTable();
		maintable3.setCheckBox(false);
		maintable3.setString1("3_test1");
		maintable3.setString2("3_test2");	
		mainTable.add(maintable3);
		
		this.tableView.setItems(mainTable);
		this.tableView.setEditable(true);
		
		maintable1.checkBoxProperty().addListener((obs, faxWasRequested, faxIsNowRequested) ->{
            System.out.printf("%s changed request from %s to %s %n", 
            maintable1.checkBoxProperty(), faxWasRequested, faxIsNowRequested);
            if(maintable1.getCheckBox()){
	            maintable2.setCheckBox(false);
	            maintable3.setCheckBox(false);
                }
        });
		maintable2.checkBoxProperty().addListener((obs, faxWasRequested, faxIsNowRequested) ->{
            System.out.printf("%s changed request from %s to %s %n", 
            maintable2.checkBoxProperty(), faxWasRequested, faxIsNowRequested);
            if(maintable2.getCheckBox()){
            	maintable1.setCheckBox(false);
            	maintable3.setCheckBox(false);
            }
		});
		maintable3.checkBoxProperty().addListener((obs, faxWasRequested, faxIsNowRequested) ->{
            System.out.printf("%s changed request from %s to %s %n", 
            maintable3.checkBoxProperty(), faxWasRequested, faxIsNowRequested);
            if(maintable3.getCheckBox()){
            	maintable1.setCheckBox(false);
            	maintable2.setCheckBox(false);
            }
		});
		
		/*
		for (MainTable mt : mainTable) {
			mt.checkBoxProperty().addListener((obs, faxWasRequested, faxIsNowRequested) ->{
                System.out.printf("%s changed request from %s to %s %n", 
                		mt.checkBoxProperty(), faxWasRequested, faxIsNowRequested);
            });
        }*/
	
	}
}
