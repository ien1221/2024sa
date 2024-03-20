package com.codurance.training.tasks.usecase.out;

public class ErrorOutputDto implements IOutputDto{
    private String _result = "";

    public ErrorOutputDto(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
