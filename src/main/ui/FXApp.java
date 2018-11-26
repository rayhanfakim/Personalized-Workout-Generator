package main.ui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import main.model.Day;
import main.model.Program;

public class FXApp extends Application {

    static String name;
    static Stage stage;
    static Program program;
    static Day day;


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));

        primaryStage.setScene(new Scene(root));
        stage = primaryStage;
        primaryStage.show();
    }

    public static void main(String[] args) {
        new Setup();
        launch(args);
    }

    public static void quit(){
        System.exit(0);
    }

    public static Stage getStage(){
        return stage;
    }
}
