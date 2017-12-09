package application;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class TestTableCell extends Application {

    private TableView<ClinicClientInfo> clientTable = new TableView<>();
    private TableColumn<ClinicClientInfo, String> faxCol = new TableColumn<>("Fax");
    private TableColumn<ClinicClientInfo, Boolean> requestedFaxCol = new TableColumn<>("Requested Fax");

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();

        ObservableList<ClinicClientInfo> list = FXCollections.observableArrayList(
                new ClinicClientInfo("", false), 
                new ClinicClientInfo("945-342-4324", true));


        // add listeners to boolean properties:
        for (ClinicClientInfo clinic : list) {
            clinic.clientHasRequestedFaxProperty().addListener((obs, faxWasRequested, faxIsNowRequested) ->{
                System.out.printf("%s changed fax request from %s to %s %n", 
                        clinic.getClinicFax(), faxWasRequested, faxIsNowRequested);
            });
        }

        root.getChildren().add(clientTable);
        clientTable.getColumns().addAll(faxCol, requestedFaxCol);
        clientTable.setItems(list);
        clientTable.setEditable(true);
        clientTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        faxCol.setCellValueFactory(new PropertyValueFactory<>("clinicFax"));
        faxCol.setVisible(true);

        requestedFaxCol.setCellValueFactory(new PropertyValueFactory<>("clientHasRequestedFax"));
        requestedFaxCol.setCellFactory(CheckBoxTableCell.forTableColumn(requestedFaxCol));
        requestedFaxCol.setVisible(true);
        requestedFaxCol.setEditable(true);


        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public class ClinicClientInfo {
        private final StringProperty clinicFax;
        private final BooleanProperty clientHasRequestedFax;

        public ClinicClientInfo(String fax, boolean clientHasRequestedFax){
            this.clinicFax = new SimpleStringProperty(fax);
            this.clientHasRequestedFax = new SimpleBooleanProperty(clientHasRequestedFax);
        }

        public String getClinicFax(){
            return clinicFax.get();
        }

        public void setClinicFax(String clinicFax){
            this.clinicFax.set(clinicFax);
        }

        public StringProperty clinicFaxProperty(){
            return clinicFax;
        }

        public boolean getClientHasRequestedFax(){
            return clientHasRequestedFax.get();
        }

        public void setClientHasRequestedFax(boolean clientHasRequestedFax){
            this.clientHasRequestedFax.set(clientHasRequestedFax);
        }

        public BooleanProperty clientHasRequestedFaxProperty(){
            return clientHasRequestedFax;
        }
    }


}