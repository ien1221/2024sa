package com.codurance.training.tasks.usecase.out;

public class UncheckOutput implements Output {
    private String _result = "";
    public UncheckOutput(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
