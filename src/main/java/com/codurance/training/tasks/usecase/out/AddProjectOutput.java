package com.codurance.training.tasks.usecase.out;

public class AddProjectOutput implements Output {
    private String _result = "";
    public AddProjectOutput(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
