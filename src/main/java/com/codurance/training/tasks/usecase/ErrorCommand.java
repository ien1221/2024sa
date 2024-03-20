package com.codurance.training.tasks.usecase;

import com.codurance.training.tasks.usecase.out.ErrorOutputDto;
import com.codurance.training.tasks.usecase.out.IOutputDto;

public class ErrorCommand implements ICommand{
    private final String _command;
    public ErrorCommand(String command){
        _command = command;
    }
    public IOutputDto execute(){
        String message = String.format("I don't know what the command \"%s\" is.\r\n", _command);
        ErrorOutputDto result = new ErrorOutputDto();
        result.setResult(message);
        return result;
    }
}
