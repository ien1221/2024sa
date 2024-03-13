package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.TaskList;

public class CheckCommand implements ICommand{
    private final String _command;
    public CheckCommand(String command){
        _command = command;
    }
    public void execute(TaskList taskList){
        taskList.setDone(_command, true);
    }
}