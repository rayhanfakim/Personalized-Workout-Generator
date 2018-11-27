package main.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import main.model.Program;

import java.io.IOException;

public class SelectProgramController {

    @FXML
    // Quit button
    private void quit(){
        System.exit(0);
    }

    @FXML
    // TwoDayProgram button, create new program in the field and load new scene of selecting day
    public void selectTwoDayProgram(MouseEvent mouseEvent) throws IOException {
        FXApp.program = Program.DEFAULT_TWO_DAY_PROGRAM;

        loadNextScene("SelectDay.fxml");

    }

    @FXML
    // ThreeDayProgram button, create new program in the field and load new scene of selecting day
    public void selectThreeDayProgram(MouseEvent mouseEvent) throws IOException {
        FXApp.program = Program.DEFAULT_THREE_DAY_PROGRAM;

        loadNextScene("SelectDay.fxml");

    }

    @FXML
    // Back button, go back to MainMenu
    public void back(MouseEvent mouseEvent) throws IOException {
        loadNextScene("MainMenu.fxml");
    }

    @FXML
    // Next screen loader -> SelectDay/MainMenu Scene
    private void loadNextScene(String s) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(s));
        // Loads the object: the scene s
        Parent root = loader.load();

        FXApp.stage.setScene(new Scene(root));
        FXApp.stage.show();
    }


}

