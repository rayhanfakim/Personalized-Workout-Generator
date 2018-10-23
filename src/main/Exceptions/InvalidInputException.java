package main.Exceptions;

public class InvalidInputException extends RetryAnswerException {
    public InvalidInputException(){
        System.out.println("please enter a valid number");
        System.out.println("Which program are you currently working on?");
        System.out.println("[1] Stretching program - Stay tuned, it's coming!");
        System.out.println("[2] Two days program");
        System.out.println("[3] Three days program");
    }
}
