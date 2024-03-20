package com.codurance.training.tasks.usecase;

import com.codurance.training.tasks.entity.Task;
import com.codurance.training.tasks.entity.TaskList;
import com.codurance.training.tasks.usecase.out.IOutputDto;
import com.codurance.training.tasks.usecase.out.UncheckOutputDto;

import java.util.List;
import java.util.Map;

public class UncheckCommand implements ICommand{
    private final String _command;
    public UncheckCommand(String command){
        _command = command;
    }
    public IOutputDto execute(){
        TaskList taskList = TaskList.getInstance();
        UncheckOutputDto result = new UncheckOutputDto();

        int id = Integer.parseInt(_command);
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
