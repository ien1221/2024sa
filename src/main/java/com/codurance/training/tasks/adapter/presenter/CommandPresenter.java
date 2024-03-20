package com.codurance.training.tasks.adapter.presenter;

import com.codurance.training.tasks.usecase.out.Output;

public class CommandPresenter {
    private final Output _result;
    public CommandPresenter(Output result){
        _result = result;
    }

    public String getResult(){
        return _result.getResult();
    }

    public boolean hasResult(){
        return !_result.getResult().isEmpty();
    }
}
