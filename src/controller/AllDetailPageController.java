package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AllDetailPageController {

    public AnchorPane context;
    @FXML
    private TableView tblDetails;

    @FXML
    private TableColumn colStudentId;

    @FXML
    private TableColumn colFirstName;

    @FXML
    private TableColumn colLastName;

    @FXML
    private TableColumn colProgramId;

    @FXML
    private TableColumn colProgram;

    @FXML
    private TableColumn colFee;

    @FXML
    private TableColumn colDuration;

    @FXML
    private TextField txtSearch;

    public void goToBackPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MainPage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
