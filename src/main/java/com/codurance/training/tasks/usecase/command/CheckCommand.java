package com.codurance.training.tasks.usecase.command;

import com.codurance.training.tasks.entity.Task;
import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.input.CheckInput;
import com.codurance.training.tasks.usecase.out.CheckOutput;
import com.codurance.training.tasks.usecase.out.Output;

import java.util.List;
import java.util.Map;

public class CheckCommand implements Command<CheckInput> {
    public CheckCommand(){}
    public Output execute(CheckInput input){
        TaskList taskList = TaskList.getInstance();
        CheckOutput result = new CheckOutput();

        int id = input.getId();
        for (Map.Entry<String, List<Task>> project : taskList.getTasks().entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId() == id) {
                    taskList.setDone(task, true);
                    return result;
                }
            }
        }
        result.setResult(String.format("Could not find a task with an ID of %d.\r\n", id));
        return result;
    }
}
