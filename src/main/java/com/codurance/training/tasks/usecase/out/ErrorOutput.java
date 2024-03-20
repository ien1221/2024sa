package com.codurance.training.tasks.usecase.out;

public class ErrorOutput implements Output {
    private String _result = "";

    public ErrorOutput(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
