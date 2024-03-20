package com.codurance.training.tasks.adapter.controller;

import com.codurance.training.tasks.usecase.command.HelpCommand;
import com.codurance.training.tasks.usecase.input.HelpInput;
import com.codurance.training.tasks.usecase.out.Output;

public class HelpController implements Controller{
    public HelpController(){}

    @Override
    public Output execute() {
        HelpInput input = new HelpInput();
        HelpCommand command = new HelpCommand();
        return command.execute(input);
    }
}
