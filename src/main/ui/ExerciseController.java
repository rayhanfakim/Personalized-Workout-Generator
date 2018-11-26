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
        if (exercises.size() == 1) {
            loadNextScene();
        } else if (sets.getText().equals("0")) {
            exercises.remove(0);
            Exercise newExercise = exercises.get(0);
            weight.setText("" + newExercise.getWeightExercise());
            name.setText("" + newExercise.getName());
            sets.setText("" + newExercise.getSets());
            time = newExercise.getRest() + 1;

//            chronoTimer.setTime(newExercise.getRest());
//            chronoTimer.countDown();
        } else {
            sets.setText("" + (Integer.parseInt(sets.getText()) - 1));
            time = exercises.get(0).getRest() + 1;
//            chronoTimer.setTime(exercises.get(0).getRest());
//            chronoTimer.countDown();
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        exercises = FXApp.program.getExercises().get(FXApp.day);
        Exercise firstExercise = exercises.get(0);
        weight.setText("" + firstExercise.getWeightExercise());
        name.setText("" + firstExercise.getName());
        sets.setText("" + firstExercise.getSets());
        time = firstExercise.getRest() + 1;
        timer.setText("" + time);
        ScheduledExecutorService timerService = Executors.newSingleThreadScheduledExecutor();

        timerService.scheduleAtFixedRate((Runnable) () -> {
            time--;
            Platform.runLater(() -> timer.setText("" + time));
        },0, 1, TimeUnit.SECONDS);

//        chronoTimer = Timer.create(2);
//        chronoTimer = Timer.create(firstExercise.getRest());
//        chronoTimer.countDown();
//        chronoTimer.addObserver(this);
    }

    private void loadNextScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Quit.fxml"));
        Parent root = loader.load();

        FXApp.stage.setScene(new Scene(root));
        FXApp.stage.show();
    }

//    @Override
//    public void update(Observable o, Object arg) {
//        timer.setText("" + chronoTimer.getRemaining());
//    }
}
