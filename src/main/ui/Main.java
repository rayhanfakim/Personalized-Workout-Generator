package main.ui;

import main.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // TODO replace "user.home" with file location - put in the app itself
    public static Path file = Paths.get(System.getProperty("user.home")).resolve("filename.txt");
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
//        FXApp.launch();
//        System.exit(0);
        // TODO printing out which exercise to perform for the user

        // TODO implementing timer in newmodel.Main

        Setup setup = new Setup();

        Interactions.welcome();

        try {
            URL weatherAPI = new URL("https://weather.gc.ca/rss/city/bc-74_e.xml");
            try (BufferedReader weatherFeedReader = new BufferedReader(new InputStreamReader(weatherAPI.openStream()))){
                StringBuilder weatherReportStringBuilder = new StringBuilder();
                String line;
                while ((line = weatherFeedReader.readLine()) != null){
                    weatherReportStringBuilder.append(line).append("\n");
                }

                String weatherReport = weatherReportStringBuilder.toString();
                // System.out.println(weatherReport); //0.7
                Pattern dataPattern = Pattern.compile("<b>Condition:<\\/b> (.+?) <br\\/>\n<b>Temperature:<\\/b> (\\d+(?:\\.\\d+)?)&deg;C <br\\/>");
                Matcher dataMatcher = dataPattern.matcher(weatherReport);

                if (dataMatcher.find()) {
                    String condition = dataMatcher.group(1);
                    String temperature = dataMatcher.group(2);

                    System.out.println("Today's weather is looking: "+condition+" !");
                    System.out.println("And the temperature is: "+temperature+" degrees C.\n");

                } else {
                    System.out.println("Weather unavailable.");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



        User user;

        System.out.println("Enter your name: ");
        // TODO replace all input() with input()
        String name = input(); // TODO If name found in list of previous name entered, restore weights

        System.out.println("Enter your height (cm): "); // todo put in the bodymassindex
        int height;
        while (true) {
            String input = input();
            if (!input.matches("\\d+")) { // checks if the input matches the format of a number
                System.out.println("That is not a real height."); // keeps asking the user to input if not valid number
            } else {
                height = Integer.parseInt(input); // converts a String to int
                break; //exits the loop
            }
        }

        System.out.println("Enter your weight (kg): "); // todo put in the bodymassindex
        int weight;
        while (true) {
            String input = input();
            if (!input.matches("\\d+")) { // checks if the input matches the format of a number
                System.out.println("That is not a real weight."); // keeps asking the user to input if not valid number
            } else {
                weight = Integer.parseInt(input); // converts a String to int
                break; // exits the loop
            }
        }

        double BMI = ((weight / height) / height); // todo put in the bodymassindex
        System.out.println("\nYour BMI is:" + BMI);

        user = new User(name, height, weight);

        Interactions.allProgram();
        int prg;
        while (true) {
            String input = input();
            prg = Integer.parseInt(input);
            if (prg == 1) { // TODO change the [1] for more info
                // TODO Deliverable: DONE Print out all programs (Composite)
                List<Program> programs = new ArrayList<>();
                programs.add(new TwoDayProgram("P1", Setup.twoDaysProgramExerciseMap));
                programs.add(new ThreeDayProgram("P2", Setup.threeDaysProgramExerciseMap));
                for (Program program : programs) {
                    program.print();
                }
                //user.setProgram();
                break;
            } else if (prg == 2) {
                user.setProgram(Program.DEFAULT_TWO_DAY_PROGRAM);
                break;
            } else if (prg == 3) {
                user.setProgram(Program.DEFAULT_THREE_DAY_PROGRAM);
                break;
            } else {
                System.out.println("That is not a valid program");
            }
        }

        Interactions.programChoice(prg);

        System.out.println("Enter which day you are currently on: ");
        int day;
        while (true) {
            String input = input();
            day = Integer.parseInt(input);
            if (day == 1) {
                user.setDay(new Day(1));
                break;
            } else if (day == 2) {
                user.setDay(new Day(2));
                break;
            } else if (day == 3) {
                if (user.getProgram().getExercises().keySet().size() != 3) {
                    System.out.println("That day is not in the program.");
                } else {
                    user.setDay(new Day(3));
                }
                break;
            } else {
                System.out.println("That is not a valid program. Please try again. ");
            }
        }

        Interactions.dayChoice(day);

        for (Exercise e : user.getProgram().getExercises().get(user.getDay())) {
            System.out.println("Next: " + e.getName());

            for (int i = 0; i < e.getSets(); i++) {
                String isDone = input();
                Timer.create(e.getRest()).countDown();
            }
        }

        System.out.println();


    }

    public static String input() {
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}