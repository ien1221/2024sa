package com.codurance.training.tasks.usecase.out;

public class HelpOutputDto implements IOutputDto{
    private String _result = "";
    public HelpOutputDto(){}
    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }

}
