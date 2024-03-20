package com.codurance.training.tasks.usecase;

import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.out.AddProjectOutputDto;
import com.codurance.training.tasks.usecase.out.IOutputDto;

public class AddProjectCommand implements ICommand{
    private final String _command;
    public AddProjectCommand(String command){
        _command = command;
    }
    @Override
    public IOutputDto execute(){
        TaskList.getInstance().addProject(_command);
        return new AddProjectOutputDto();
    }
}
