package main.ui;

public class Interactions {

    public Interactions(String S){
    }

    public static void allProgram(){
        System.out.println("Which program are you currently working on?");
        System.out.println("[1] Stretching program - Stay tuned, it's coming!");
        System.out.println("[2] Two days program");
        System.out.println("[3] Three days program");
    }

    public static void welcome() {
        System.out.println("Welcome to the personalized workout generator!\n");
    }

    public static void programChoice(int i){
        if (i == 1){
            System.out.println("You are on the stretching program.\n");
        }
        else{
            System.out.println("You are on the "+i+" days program.\n");
        }
    }

    public static void dayChoice(int i){
        if (i == 1 ){
            System.out.println("Let's begin on your 1 day!");
        }
        else {
            System.out.println("You are currently on the " + i + " day. " + "You've done " + (i - 1) + " day(s) so far!");
        }
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
    }


}
