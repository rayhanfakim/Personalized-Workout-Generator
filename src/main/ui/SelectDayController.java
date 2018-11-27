package main.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import main.model.Day;
import main.model.Program;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class SelectDayController implements Initializable{

    @FXML
    ListView<Day> days;

    @FXML
    // Next button, after selecting the day (change the field of day to the day selected,
    // in order to bring the list of ex of that day), load next scene
    public void startExercise(MouseEvent mouseEvent) throws IOException {
        FXApp.day = days.getSelectionModel().getSelectedItem();
        loadNextScene();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Day> dayList = FXCollections.observableArrayList();
        if (FXApp.program == Program.DEFAULT_TWO_DAY_PROGRAM) {
            dayList = FXCollections.observableArrayList(new Day(1), new Day(2));
        } else {
            // else, must be the three day program
            dayList = FXCollections.observableArrayList(new Day(1), new Day(2), new Day(3));
        }
        days.setItems(dayList);

        if(days.getItems().size() > 0){
            days.getSelectionModel().selectFirst();
        }
    }

    // Load next scene -> Exercise scene
    private void loadNextScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Exercise.fxml"));
        Parent root = loader.load();
        FXApp.stage.setScene(new Scene(root));
        FXApp.stage.show();
    }
}
