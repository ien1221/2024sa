package com.codurance.training.tasks.usecase.out;

public class CheckOutput implements Output {
    private String _result = "";
    public CheckOutput(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
