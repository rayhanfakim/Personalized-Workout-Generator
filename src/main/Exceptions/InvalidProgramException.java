package main.Exceptions;

import main.newui.Interactions;

public class InvalidProgramException extends RetryAnswerException {
    public InvalidProgramException(){
        Interactions.allProgram();
    }
}
