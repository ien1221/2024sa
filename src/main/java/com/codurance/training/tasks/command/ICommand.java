package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.TaskList;

public interface ICommand {
    String execute(TaskList taskList);
}
