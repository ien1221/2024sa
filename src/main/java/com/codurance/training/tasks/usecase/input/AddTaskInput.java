package com.codurance.training.tasks.usecase.input;

public class AddTaskInput implements Input {
    private String _projectName;
    private String _description;

    public AddTaskInput(String projectName, String description){
        _projectName = projectName;
        _description = description;
    }

    public String getProjectName(){
        return _projectName;
    }

    public String getDescription(){
        return _description;
    }
}
