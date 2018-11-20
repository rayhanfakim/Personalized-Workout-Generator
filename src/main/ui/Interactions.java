package main.ui;

import main.model.OpenWebpage;
import main.model.Program;

import java.net.MalformedURLException;
import java.net.URL;

import static main.ui.Main.input;

public class Interactions {

    public Interactions(String S){
    }

    String name = input();

// TODO: Do French version
    public static void welcome() {
        System.out.println("Welcome to the personalized workout generator!");

//        System.out.println("Bienvenue au generateur d'exercice personalisee! \n");
    }

    public static void allProgram(){
        System.out.println("Which program are you currently working on?");
        System.out.println("[1] For more informations about the programs");
        System.out.println("[2] Two   days program");
        System.out.println("[3] Three days program");

//        System.out.println("Quel est le programme que vous travaillerez? ");
//        System.out.println("[1] Programme d'etirement - Pour bientot!");
//        System.out.println("[2] Programme de deux  jours");
//        System.out.println("[3] Programme de trois jours");

    }



    public static void programChoice(int i){
        if (i == 1){
            System.out.println("\nThis workout generator was created by Rayhan Fakim. Feel free to contact him by:");
            System.out.println("[1] Email \n[2] LinkedIn \n ");
            int contact;
            while (true) {
                String input = input();
                contact = Integer.parseInt(input);
                if (contact == 1) {
                    System.out.println("rayhan.fakim@gmail.com");
                    break;
                } else if (contact == 2) {
                    try {
                        OpenWebpage.openWebpage(new URL("http://www.linkedin.com/in/rayhanfakim/")); // TODO check this
                    } catch (MalformedURLException ignored) {
                        // ignored exception, because it can never occur since the url always exists
                    }
                    break;
                } else {
                    System.out.println("That is not a valid input");
                }
            }
        }
        else{
            System.out.println("You are on the "+i+" days program.\n");
        }

//        System.out.println("Vous etes sur le programme d'etirement.\n");
//        System.out.println("Vous etes sur le "+i+" programme.");
    }

    public static void dayChoice(int i){
        if (i == 1 ){
            System.out.println("Let's begin on your 1 day!");
        }
        else {
            System.out.println("You are currently on the " + i + " day. " + "You've done " + (i - 1) + " day(s) so far!");
        }

//        System.out.println("Commencons votre premier jours!");
//        System.out.println("Vous etes sur le "+i+"eme jour." + "Vous avez fait " + (i - 1) + "jour(s) deja!");

    }

    public static void followingStatementEx(int i){

        if (i == 0){
            System.out.println("You will start with: ");
        }
        if (i == 1){
            System.out.println("Now you are on: ");
        }
        if (i == 2){
            System.out.println("Next up: ");
        }
        if (i == 3){

            System.out.println("You will be doing: ");
        }
        if (i == 9){
            System.out.println("Done! ");
        }

//        System.out.println("Commencez par: ");
//        System.out.println("Maintenant, vous allez faire: ");
//        System.out.println("Le prochain est: ");
//        System.out.println("Le suivant est: ");
//        System.out.println("Fini!");
    }


}
