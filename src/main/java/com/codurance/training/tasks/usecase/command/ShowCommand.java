package com.codurance.training.tasks.usecase.command;

import com.codurance.training.tasks.entity.Task;
import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.input.Input;
import com.codurance.training.tasks.usecase.input.ShowInput;
import com.codurance.training.tasks.usecase.out.Output;
import com.codurance.training.tasks.usecase.out.ShowOutput;

import java.util.List;
import java.util.Map;

public class ShowCommand implements Command<ShowInput> {
    public Output execute(ShowInput input){
        StringBuilder message = new StringBuilder();
        for (Map.Entry<String, List<Task>> project : TaskList.getInstance().getTasks().entrySet()) {
            message.append(project.getKey()).append(System.lineSeparator());
            for (Task task : project.getValue()) {
                String description = String.format("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
                message.append(description);
            }
            message.append(System.lineSeparator());
        }
        ShowOutput result = new ShowOutput();
        result.setResult(message.toString());
        return result;
    }
}
