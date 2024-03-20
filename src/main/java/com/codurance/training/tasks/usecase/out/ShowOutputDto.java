package com.codurance.training.tasks.usecase.out;

public class ShowOutputDto implements IOutputDto{
    private String _result = "";
    public ShowOutputDto(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
