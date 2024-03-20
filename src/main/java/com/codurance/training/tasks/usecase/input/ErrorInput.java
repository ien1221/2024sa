package com.codurance.training.tasks.usecase.input;

public class ErrorInput implements Input {
    private final String _command;

    public ErrorInput(String command){
        _command = command;
    }

    public String getCommand(){
        return _command;
    }
}
