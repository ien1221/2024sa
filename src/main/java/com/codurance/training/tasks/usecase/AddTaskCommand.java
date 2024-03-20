package com.codurance.training.tasks.usecase;

import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.out.AddTaskOutputDto;
import com.codurance.training.tasks.usecase.out.IOutputDto;

public class AddTaskCommand implements ICommand{
    private final String _command;
    public AddTaskCommand(String commandRest){
        _command = commandRest;
    }
    public IOutputDto execute(){
        String[] projectTask = _command.split(" ", 2);
        AddTaskOutputDto result = new AddTaskOutputDto();
        if(!TaskList.getInstance().isProjectExist(projectTask[0])){
            result.setResult(String.format("Could not find a project with the name \"%s\".\r\n", projectTask[0]));
        }else{
            TaskList.getInstance().addTask(projectTask[0], projectTask[1]);//[0]project [1]description
        }
        return result;
    }
}
