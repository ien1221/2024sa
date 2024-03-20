package com.codurance.training.tasks.usecase.out;

public class UncheckOutputDto implements IOutputDto{
    private String _result = "";
    public UncheckOutputDto(){}

    @Override
    public String getResult(){
        return _result;
    }

    public void setResult(String result){
        _result = result;
    }
}
