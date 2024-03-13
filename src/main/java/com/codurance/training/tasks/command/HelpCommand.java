package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.TaskList;

public class HelpCommand implements ICommand{
    public String execute(TaskList taskList){
        return "Commands:" + "\n" +
                "  show" + "\n" +
                "  add project <project name>" + "\n" +
                "  add task <project name> <task description>" + "\n" +
                "  check <task ID>" + "\n" +
                "  uncheck <task ID>" + "\n";
    }
}
