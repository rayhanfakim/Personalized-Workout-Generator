package main.ui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import main.model.Exercise;
import main.model.Timer;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExerciseController implements Initializable {
    private List<Exercise> exercises;
//    private Observer<>

    private int time;



    @FXML
    public Label weight;

    @FXML
    public Label timer;

    @FXML
    public Label name;

    @FXML
    public Label sets;

    @FXML
    public Button nextSet;

    @FXML
    private void nextCycle(MouseEvent mouseEvent) throws IOException {
        //When the button is pressed, to reset all new details
        if (exercises.size() == 1) {
            // There is no more exercise left to do, go to quit scene
            loadNextScene("Quit.fxml");

        } else if (sets.getText().equals("0")) {
            // If the number of sets is 0, update exercise:
            // Remove the exercise from the list
            exercises.remove(0);

            // Get new exercise
            Exercise newExercise = exercises.get(0);
            // Update new details of exercise, with weight, name, sets, and time
            weight.setText("" + newExercise.getWeightExercise());
            name.setText("" + newExercise.getName());
            sets.setText("" + newExercise.getSets());
            // Added plus one, for two have it exactly at the nice number
            time = newExercise.getRest() + 1;

        } else {
            // Update the timer label
            sets.setText("" + (Integer.parseInt(sets.getText()) - 1));
            time = exercises.get(0).getRest() + 1;

        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Instantiate new list, list of exercise chosen by the program and day  (for the first one ever)
        exercises = FXApp.program.getExercises().get(FXApp.day);

        // Get the first exercise of the list
        Exercise firstExercise = exercises.get(0);

        // Update, the weights, name and sets, and timer
        weight.setText("" + firstExercise.getWeightExercise());
        name.setText("" + firstExercise.getName());
        sets.setText("" + firstExercise.getSets());
        // Plus one to make it nicer
        time = firstExercise.getRest() + 1;
        timer.setText("" + time);

        // Running the timer in a different tread, so that the we can click on the button
        // and not being blocked until the countdown is over
        // http://tutorials.jenkov.com/java-util-concurrent/scheduledexecutorservice.html
        ScheduledExecutorService timerService = Executors.newSingleThreadScheduledExecutor();

        // the method of the timer is running separately
        timerService.scheduleAtFixedRate((Runnable) () -> {
            if (!(time ==0)){
            time--;
            Platform.runLater(() -> timer.setText("" + time));
        }},0, 1, TimeUnit.SECONDS);


    }

    private void loadNextScene(String s) throws IOException {
        // Load next scene, quit scene, "congratulations"
        FXMLLoader loader = new FXMLLoader(getClass().getResource(s));
        Parent root = loader.load();

        FXApp.stage.setScene(new Scene(root));
        FXApp.stage.show();
    }


    @FXML
    private void quit(){
        System.exit(0);
    }

    @FXML
    private void back(MouseEvent mouseEvent) throws IOException {
        loadNextScene("SelectDay.fxml");
    }
}
