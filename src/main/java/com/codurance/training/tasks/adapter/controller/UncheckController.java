package com.codurance.training.tasks.adapter.controller;

import com.codurance.training.tasks.usecase.command.UncheckCommand;
import com.codurance.training.tasks.usecase.input.UncheckInput;
import com.codurance.training.tasks.usecase.out.Output;

public class UncheckController implements Controller{
    private final String _command;

    public UncheckController(String command){
        _command = command;
    }
    @Override
    public Output execute() {
        int id = Integer.parseInt(_command);
        UncheckInput input = new UncheckInput(id);
        UncheckCommand command = new UncheckCommand();
        return command.execute(input);
    }
}
