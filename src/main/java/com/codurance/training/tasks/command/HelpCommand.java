package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.TaskList;

public class HelpCommand implements ICommand{
    public String execute(TaskList taskList){
        return "Commands:" + "\r\n" +
                "  show" + "\r\n" +
                "  add project <project name>" + "\r\n" +
                "  add task <project name> <task description>" + "\r\n" +
                "  check <task ID>" + "\r\n" +
                "  uncheck <task ID>" + "\r\n";
    }
}
