package com.codurance.training.tasks.usecase.out;

public class AddProjectOutputDto implements IOutputDto{
    private String _result = "";
    public AddProjectOutputDto(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
