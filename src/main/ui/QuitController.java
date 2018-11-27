package main.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import main.model.Program;

import java.io.IOException;

public class QuitController {

    @FXML
    public Button done;

    @FXML
    // quit button
    private void quit(){
        System.exit(0);
    }

}
