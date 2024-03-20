package com.codurance.training.tasks.usecase.input;

public class AddProjectInput implements Input {
    private final String _projectName;
    public AddProjectInput(String projectName){
        _projectName = projectName;
    }

    public String getProjectName(){
        return _projectName;
    }
}
