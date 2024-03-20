package com.codurance.training.tasks.adapter;

import com.codurance.training.tasks.adapter.controller.*;

public class ControllerFactory {
    public ControllerFactory(){}

    public Controller createController(String commandLine){
        String[] commandRest = commandLine.split(" ", 2);
        String command = commandRest[0];
        switch (command) {
            case "show":
                return new ShowController();
            case "add":
                return Add(commandRest[1]);
            case "check":
                return new CheckController(commandRest[1]);
            case "uncheck":
                return new UncheckController(commandRest[1]);
            case "help":
                return new HelpController();
            default:
                return new ErrorController(command);
        }
    }

    private Controller Add(String command){
        String[] subcommandRest = command.split(" ", 2);
        String subcommand = subcommandRest[0];
        if (subcommand.equals("project")) {
            return new AddProjectController(subcommandRest[1]);
        } else if (subcommand.equals("task")) {
            return new AddTaskController(subcommandRest[1]);
        }
        return new ErrorController(subcommand);
    }
}
