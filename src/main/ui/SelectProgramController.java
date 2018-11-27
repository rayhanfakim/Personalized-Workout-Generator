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
    private void quit(){
        System.exit(0);
    }

    @FXML
    // TwoDayProgram button, create new program in the field and load new scene
    public void selectTwoDayProgram(MouseEvent mouseEvent) throws IOException {
        FXApp.program = Program.DEFAULT_TWO_DAY_PROGRAM;

        loadNextScene();

    }

    @FXML
    // ThreeDayProgram button, create new program in the field and load new scene
    public void selectThreeDayProgram(MouseEvent mouseEvent) throws IOException {
        FXApp.program = Program.DEFAULT_THREE_DAY_PROGRAM;

        loadNextScene();

    }

    // Next screen loader -> SelectDay Scene
    private void loadNextScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SelectDay.fxml"));
        Parent root = loader.load();

        FXApp.stage.setScene(new Scene(root));
        FXApp.stage.show();
    }

}

