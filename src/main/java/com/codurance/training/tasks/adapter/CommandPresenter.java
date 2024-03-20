package com.codurance.training.tasks.adapter;

import com.codurance.training.tasks.usecase.out.IOutputDto;

public class CommandPresenter {
    private IOutputDto _result;
    public CommandPresenter(IOutputDto result){
        _result = result;
    }

    public String getResult(){
        return _result.getResult();
    }

    public boolean hasResult(){
        return !_result.getResult().isEmpty();
    }
}
