package com.codurance.training.tasks.usecase;

import com.codurance.training.tasks.usecase.out.HelpOutputDto;
import com.codurance.training.tasks.usecase.out.IOutputDto;

public class HelpCommand implements ICommand{
    @Override
    public IOutputDto execute(){
        String message = "Commands:" + System.lineSeparator() +
                        "  show" + System.lineSeparator() +
                        "  add project <project name>" + System.lineSeparator() +
                        "  add task <project name> <task description>" + System.lineSeparator() +
                        "  check <task ID>" + System.lineSeparator() +
                        "  uncheck <task ID>" + System.lineSeparator();
        HelpOutputDto result = new HelpOutputDto();
        result.setResult(message);
        return result;
    }
}
