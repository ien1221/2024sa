package com.codurance.training.tasks.usecase.command;

import com.codurance.training.tasks.usecase.input.ErrorInput;
import com.codurance.training.tasks.usecase.out.ErrorOutput;
import com.codurance.training.tasks.usecase.out.Output;

public class ErrorCommand implements Command<ErrorInput> {
    public ErrorCommand(){}
    public Output execute(ErrorInput input){
        String message = String.format("I don't know what the command \"%s\" is.\r\n", input.getCommand());
        ErrorOutput result = new ErrorOutput();
        result.setResult(message);
        return result;
    }
}
