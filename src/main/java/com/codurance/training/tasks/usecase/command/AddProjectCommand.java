package com.codurance.training.tasks.usecase.command;

import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.input.AddProjectInput;
import com.codurance.training.tasks.usecase.input.Input;
import com.codurance.training.tasks.usecase.out.AddProjectOutput;
import com.codurance.training.tasks.usecase.out.Output;

public class AddProjectCommand implements Command<AddProjectInput> {
    public AddProjectCommand(){}
    @Override
    public Output execute(AddProjectInput input){
        TaskList.getInstance().addProject(input.getProjectName());
        return new AddProjectOutput();
    }
}
