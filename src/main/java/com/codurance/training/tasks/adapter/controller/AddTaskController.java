package com.codurance.training.tasks.adapter.controller;

import com.codurance.training.tasks.usecase.command.AddTaskCommand;
import com.codurance.training.tasks.usecase.input.AddTaskInput;
import com.codurance.training.tasks.usecase.out.Output;

public class AddTaskController implements Controller{
    public String _command;

    public AddTaskController(String command){
        _command = command;
    }
    @Override
    public Output execute() {
        String[] projectTask = _command.split(" ", 2);
        String projectName = projectTask[0];
        String description = projectTask[1];

        AddTaskInput input = new AddTaskInput(projectName, description);
        AddTaskCommand command = new AddTaskCommand();
        return command.execute(input);
    }
}
