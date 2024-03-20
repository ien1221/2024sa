package com.codurance.training.tasks.usecase;

import com.codurance.training.tasks.entity.Task;
import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.out.IOutputDto;
import com.codurance.training.tasks.usecase.out.ShowOutputDto;

import java.util.List;
import java.util.Map;

public class ShowCommand implements ICommand{
    public IOutputDto execute(){
        StringBuilder message = new StringBuilder();
        for (Map.Entry<String, List<Task>> project : TaskList.getInstance().getTasks().entrySet()) {
            message.append(project.getKey()).append(System.lineSeparator());
            for (Task task : project.getValue()) {
                String description = String.format("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
                message.append(description);
            }
            message.append(System.lineSeparator());
        }
        ShowOutputDto result = new ShowOutputDto();
        result.setResult(message.toString());
        return result;
    }
}
