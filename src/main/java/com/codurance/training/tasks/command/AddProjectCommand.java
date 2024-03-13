package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.TaskList;

public class AddProjectCommand implements ICommand{
    private final String _command;
    public AddProjectCommand(String command){
        _command = command;
    }
    public void execute(TaskList taskList){
        taskList.addProject(_command);
    }
}
