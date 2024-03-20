package com.codurance.training.tasks.usecase.out;

public class AddTaskOutput implements Output {
    private String _result = "";
    public AddTaskOutput(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
