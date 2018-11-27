package main.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputEvent;
import main.model.OpenWebpage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class MainMenuController {

    @FXML
    // Input of height
    private TextField height;

    @FXML
    // Input of weight
    private TextField weight;

    @FXML
    // Show the BMI result
    private Label BMILabel;


    @FXML
    // Quit Button
    private void quit(){
        System.exit(0);
    }

    @FXML
    private void calculateBMI(InputEvent inputEvent){
        double h = Double.parseDouble(height.getText());
        double w = Double.parseDouble(weight.getText());
        // calculate BMI from input
        double BMI = ((w / h) / h);

        // Update BMI label with calculated BMI
        BMILabel.setText(Double.toString(BMI));

    }

    @FXML
    // 'Author' button
    private void openAbout(InputEvent inputEvent) throws MalformedURLException {

        OpenWebpage.openWebpage(new URL("https://www.linkedin.com/in/rayhanfakim/"));

    }

    @FXML
    // 'Info' button
    private void openBMI(InputEvent inputEvent) throws MalformedURLException {

        OpenWebpage.openWebpage(new URL("https://www.unicarestateplan.com/pdf/bmiFlyer.pdf"));

    }

    @FXML
    // 'Next' Scene, load scene to select the program
    private void selectProgram(InputEvent inputEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SelectProgram.fxml"));
        Parent root = loader.load();

        FXApp.stage.setScene(new Scene(root));
        FXApp.stage.show();
    }

}
