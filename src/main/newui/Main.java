package main.newui;

import main.newmodel.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    // TODO replace "user.home" with file location - put in the app itself
    public static Path file = Paths.get(System.getProperty("user.home")).resolve("filename.txt");
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        // TODO printing out which exercise to perform for the user

        // TODO implementing timer in newmodel.Main

        Setup setup = new Setup();

        Interactions.welcome();

        User user;

        System.out.println("Enter your name: ");
        // TODO replace all input() with input()
        String name = input(); // TODO If name found in list of previous name entered, restore weights

        System.out.println("Enter your height (cm): ");
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

        System.out.println("Enter your weight (kg): ");
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

        double BMI = ((weight / height) / height);
        System.out.println("\nYour BMI is:" + BMI);

        user = new User(name, height, weight);

        Interactions.allProgram();
        int prg;
        while (true) {
            String input = input();
            prg = Integer.parseInt(input);
            if (prg == 1) {
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
