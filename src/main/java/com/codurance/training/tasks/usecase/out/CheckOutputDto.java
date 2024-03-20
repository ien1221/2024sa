package com.codurance.training.tasks.usecase.out;

public class CheckOutputDto implements IOutputDto{
    private String _result = "";
    public CheckOutputDto(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
