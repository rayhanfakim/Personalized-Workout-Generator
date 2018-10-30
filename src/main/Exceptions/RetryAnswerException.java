package main.Exceptions;

import java.util.Random;
import java.util.Scanner;

public class RetryAnswerException extends Exception {

    public RetryAnswerException() {
        System.out.println("Wrong input, please retry.");

    }
}
