package com.codurance.training.tasks.usecase.out;

public class ShowOutput implements Output {
    private String _result = "";
    public ShowOutput(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
