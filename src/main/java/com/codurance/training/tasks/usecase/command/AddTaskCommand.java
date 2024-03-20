package com.codurance.training.tasks.usecase.command;

import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.input.AddTaskInput;
import com.codurance.training.tasks.usecase.out.AddTaskOutput;
import com.codurance.training.tasks.usecase.out.Output;

public class AddTaskCommand implements Command<AddTaskInput> {
    public AddTaskCommand(){}
    public Output execute(AddTaskInput input){
        AddTaskOutput result = new AddTaskOutput();
        String projectName = input.getProjectName();
        String description = input.getDescription();

        if(!TaskList.getInstance().isProjectExist(projectName)){
            result.setResult(String.format("Could not find a project with the name \"%s\".\r\n", projectName));
        }else{
            TaskList.getInstance().addTask(projectName, description);
        }
        return result;
    }
}
