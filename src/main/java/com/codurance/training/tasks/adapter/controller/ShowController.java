package com.codurance.training.tasks.adapter.controller;

import com.codurance.training.tasks.usecase.command.ShowCommand;
import com.codurance.training.tasks.usecase.input.ShowInput;
import com.codurance.training.tasks.usecase.out.Output;

public class ShowController implements Controller{
    @Override
    public Output execute() {
        ShowCommand command = new ShowCommand();
        return command.execute(new ShowInput());
    }
}
