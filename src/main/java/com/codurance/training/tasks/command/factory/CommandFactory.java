package com.codurance.training.tasks.command.factory;

import com.codurance.training.tasks.command.*;
import com.codurance.training.tasks.taskList.TaskList;

public class CommandFactory {
    public CommandFactory(){}

    public ICommand createCommand(String commandLine){
        String[] commandRest = commandLine.split(" ", 2);
        String command = commandRest[0];
        switch (command) {
            case "show":
//                show();
                return new ShowCommand();
            case "add":
//                add(commandRest[1]);
//                return new AddProjectCommand(commandRest[1]);
                return Add(commandRest[1]);
            case "check":
//                check(commandRest[1]);
                return new CheckCommand(commandRest[1]);
            case "uncheck":
//                uncheck(commandRest[1]);
                return new UncheckCommand(commandRest[1]);
            case "help":
//                help();
                return new HelpCommand();
            default:
//                error(command);
                return new ErrorCommand();
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
        return new ErrorCommand();
    }
}
