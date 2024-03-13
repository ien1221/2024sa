package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.TaskList;

public class AddTaskCommand implements ICommand{
    private final String _command;
    public AddTaskCommand(String commandRest){
        _command = commandRest;
    }
    public String execute(TaskList taskList){
        String[] projectTask = _command.split(" ", 2);
        if(!taskList.isProjectExist(projectTask[0])){
            return String.format("Could not find a project with the name \"%s\".\r\n", projectTask[0]);
        }else{
            taskList.addTask(projectTask[0], projectTask[1]);//[0]project [1]description
            return "";
        }
    }
}
