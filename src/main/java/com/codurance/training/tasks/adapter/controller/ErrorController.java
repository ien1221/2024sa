package com.codurance.training.tasks.adapter.controller;

import com.codurance.training.tasks.usecase.command.ErrorCommand;
import com.codurance.training.tasks.usecase.input.ErrorInput;
import com.codurance.training.tasks.usecase.out.Output;

public class ErrorController implements Controller{
    private final String _command;
    public ErrorController(String command){
        _command = command;
    }
    @Override
    public Output execute() {
        ErrorInput input = new ErrorInput(_command);
        ErrorCommand command = new ErrorCommand();
        return command.execute(input);
    }
}
