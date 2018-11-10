package main.newui;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Interactions {

    public Interactions(String S){
    }
// TODO: Do French version
    public static void welcome() {
        System.out.println("Welcome to the personalized workout generator!\n");

//        System.out.println("Bienvenue au generateur d'exercice personalisee! \n");
    }

    public static void allProgram(){
        System.out.println("Which program are you currently working on?");
        System.out.println("[1] For more the programs");
        System.out.println("[2] Two   days program");
        System.out.println("[3] Three days program");

//        System.out.println("Quel est le programme que vous travaillerez? ");
//        System.out.println("[1] Programme d'etirement - Pour bientot!");
//        System.out.println("[2] Programme de deux  jours");
//        System.out.println("[3] Programme de trois jours");

    }



    public static void programChoice(int i){
        if (i == 1){
            System.out.println("You are on the stretching program.\n");
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
