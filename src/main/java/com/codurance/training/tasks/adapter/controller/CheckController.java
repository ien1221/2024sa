package com.codurance.training.tasks.adapter.controller;

import com.codurance.training.tasks.usecase.command.CheckCommand;
import com.codurance.training.tasks.usecase.input.CheckInput;
import com.codurance.training.tasks.usecase.out.Output;

public class CheckController implements Controller{
    private final String _command;
    public CheckController(String command){
        _command = command;
    }
    @Override
    public Output execute() {
        int id = Integer.parseInt(_command);
        CheckInput input = new CheckInput(id);
        CheckCommand command = new CheckCommand();
        return command.execute(input);
    }
}
