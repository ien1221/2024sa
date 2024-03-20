package com.codurance.training.tasks.usecase.out;

public class HelpOutput implements Output {
    private String _result = "";
    public HelpOutput(){}
    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }

}
