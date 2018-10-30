package main.Exceptions;

public class PositiveNumException extends RetryAnswerException {
    public PositiveNumException(){
        System.out.println("Input of a positive number is necessary here.");
    }
}
