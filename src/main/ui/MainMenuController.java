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
    private TextField height;

    @FXML
    private TextField weight;

    @FXML
    private Label BMILabel;


    @FXML
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
    private void openAbout(InputEvent inputEvent) throws MalformedURLException {

        OpenWebpage.openWebpage(new URL("https://www.linkedin.com/in/rayhanfakim/"));

    }

    @FXML
    private void openBMI(InputEvent inputEvent) throws MalformedURLException {

        OpenWebpage.openWebpage(new URL("https://bmicalculator.mes.fm/bmi-chart"));

    }

    @FXML
    private void selectProgram(InputEvent inputEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SelectProgram.fxml"));
        Parent root = loader.load();

        FXApp.stage.setScene(new Scene(root));
        FXApp.stage.show();
    }

}
