package com.codurance.training.tasks.usecase.command;

import com.codurance.training.tasks.usecase.input.HelpInput;
import com.codurance.training.tasks.usecase.out.HelpOutput;
import com.codurance.training.tasks.usecase.out.Output;

public class HelpCommand implements Command<HelpInput> {
    @Override
    public Output execute(HelpInput input){
        String message = "Commands:" + System.lineSeparator() +
                        "  show" + System.lineSeparator() +
                        "  add project <project name>" + System.lineSeparator() +
                        "  add task <project name> <task description>" + System.lineSeparator() +
                        "  check <task ID>" + System.lineSeparator() +
                        "  uncheck <task ID>" + System.lineSeparator();
        HelpOutput result = new HelpOutput();
        result.setResult(message);
        return result;
    }
}
