package controller;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainPageController {

    public AnchorPane context;
    public TextField txtRegisterId;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtStudentId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtdob;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContact;

    @FXML
    private ComboBox<?> cmbProgram;

    @FXML
    private Button btnSclear;

    @FXML
    private Button btnSadd;

    @FXML
    private Button btnSupdate;

    @FXML
    private Button btnSdelete;

    @FXML
    private TextField txtProgramId;

    @FXML
    private TextField txtDuration;

    @FXML
    private TextField txtProgram;

    @FXML
    private TextField txtFee;

    @FXML
    private Button btnPclear;

    @FXML
    private Button btnPadd;

    @FXML
    private Button btnPupdate;

    @FXML
    private Button btnPdelete;

    @FXML
    private Label lblTotStudent;

    @FXML
    private Label lblTotProgram;

    @FXML
    private Button btnView;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblTime;

    public void initialize(){
        loadDateAndTime();
    }

    public void loadDateAndTime() {
        // load Date
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        lblDate.setText(f.format(date));

        // load Time
        Timeline time = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();

            String state = null;
            if (currentTime.getHour() >= 12) {
                state = "PM";
            } else {
                state = "AM";
            }
            lblTime.setText("" + String.format("%02d",currentTime.getHour()) + ":" + String.format("%02d", currentTime.getMinute()) + ":" + String.format("%02d", currentTime.getSecond())+" "+state);

        }),
                new KeyFrame(Duration.seconds(1))
        );
        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }

    @FXML
    void detailsOnAction(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../view/AllDetailPage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) context.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    @FXML
    void programAddOnAction(ActionEvent event) {

    }

    @FXML
    void programClearOnAction(ActionEvent event) {
        txtProgramId.clear();
        txtProgram.clear();
        txtDuration.clear();
        txtFee.clear();
    }

    @FXML
    void programDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void programUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void studentAddOnAction(ActionEvent event) {

    }

    @FXML
    void studentClearOnAction(ActionEvent event) {

    }

    @FXML
    void studentDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void studentUpdateOnAction(ActionEvent event) {

    }
}
