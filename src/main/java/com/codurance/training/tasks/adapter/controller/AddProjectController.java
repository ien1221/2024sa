package com.codurance.training.tasks.adapter.controller;

import com.codurance.training.tasks.usecase.command.AddProjectCommand;
import com.codurance.training.tasks.usecase.input.AddProjectInput;
import com.codurance.training.tasks.usecase.out.Output;

public class AddProjectController implements Controller{
    private final String _command;

    public AddProjectController(String command){
        _command = command;
    }

    @Override
    public Output execute() {
        AddProjectInput input = new AddProjectInput(_command);
        AddProjectCommand command = new AddProjectCommand();
        return command.execute(input);
    }
}
