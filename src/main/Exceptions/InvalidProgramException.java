package main.Exceptions;

import main.ui.Interactions;

public class InvalidProgramException extends RetryAnswerException {
    public InvalidProgramException(){
        Interactions.allProgram();
    }
}
