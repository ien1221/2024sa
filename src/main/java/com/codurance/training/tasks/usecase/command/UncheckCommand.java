package com.codurance.training.tasks.usecase.command;

import com.codurance.training.tasks.entity.Task;
import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.input.UncheckInput;
import com.codurance.training.tasks.usecase.out.Output;
import com.codurance.training.tasks.usecase.out.UncheckOutput;

import java.util.List;
import java.util.Map;

public class UncheckCommand implements Command<UncheckInput> {
    public UncheckCommand(){}
    public Output execute(UncheckInput input){
        TaskList taskList = TaskList.getInstance();
        UncheckOutput result = new UncheckOutput();

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
