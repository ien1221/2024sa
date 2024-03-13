package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.TaskList;

public class UncheckCommand implements ICommand{
    private final String _command;
    public UncheckCommand(String command){
        _command = command;
    }
    public String execute(TaskList taskList){
        return taskList.setDone(_command, false);
    }
}
