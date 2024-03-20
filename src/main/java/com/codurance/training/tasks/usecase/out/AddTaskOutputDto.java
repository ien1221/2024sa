package com.codurance.training.tasks.usecase.out;

public class AddTaskOutputDto implements IOutputDto{
    private String _result = "";
    public AddTaskOutputDto(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
