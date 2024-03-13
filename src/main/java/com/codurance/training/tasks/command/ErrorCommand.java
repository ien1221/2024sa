package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.TaskList;

public class ErrorCommand implements ICommand{
    private final String _command;
    public ErrorCommand(String command){
        _command = command;
    }
    public String execute(TaskList taskList){
        return String.format("I don't know what the command \"%s\" is.\n", _command);
    }
}
