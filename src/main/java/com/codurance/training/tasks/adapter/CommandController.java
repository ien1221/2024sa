package com.codurance.training.tasks.adapter;

import com.codurance.training.tasks.usecase.*;

public class CommandController {
    public CommandController(){}

    public ICommand createCommand(String commandLine){
        String[] commandRest = commandLine.split(" ", 2);
        String command = commandRest[0];
        switch (command) {
            case "show":
                return new ShowCommand();
            case "add":
                return Add(commandRest[1]);
            case "check":
                return new CheckCommand(commandRest[1]);
            case "uncheck":
                return new UncheckCommand(commandRest[1]);
            case "help":
                return new HelpCommand();
            default:
                return new ErrorCommand(command);
        }
    }

    private ICommand Add(String command){
        String[] subcommandRest = command.split(" ", 2);
        String subcommand = subcommandRest[0];
        if (subcommand.equals("project")) {
            return new AddProjectCommand(subcommandRest[1]);
        } else if (subcommand.equals("task")) {
            return new AddTaskCommand(subcommandRest[1]);
        }
        return new ErrorCommand(subcommand);
    }
}
