package com.codurance.training.tasks.command;

import com.codurance.training.tasks.taskList.Task;
import com.codurance.training.tasks.taskList.TaskList;

import java.util.List;
import java.util.Map;

public class ShowCommand implements ICommand{
    public String execute(TaskList taskList){
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, List<Task>> project : taskList.getTasks().entrySet()) {
            result.append(project.getKey()).append("\r\n");
//            out.println(project.getKey());
            for (Task task : project.getValue()) {
                String description = String.format("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
                result.append(description);
//                out.printf("    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
            }
            result.append("\r\n");
        }
        return result.toString();
    }
}
