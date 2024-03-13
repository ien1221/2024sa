package com.codurance.training.tasks.taskList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TaskList {
    private final Map<String, List<Task>> _tasks = new LinkedHashMap<>();
    private long lastId = 0;

    public TaskList(){}


    public void addProject(String name){
        _tasks.put(name, new ArrayList<Task>());
    }

    public void addTask(String project, String description){
        List<Task> projectTasks = _tasks.get(project);
        projectTasks.add(new Task(nextId(), description, false));
    }
    private long nextId() {
        return ++lastId;
    }

    public boolean isProjectExist(String projectName){
        return _tasks.containsKey(projectName);
    }

    public String setDone(String idString, boolean done){
        int id = Integer.parseInt(idString);
        for (Map.Entry<String, List<Task>> project : _tasks.entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId() == id) {
                    task.setDone(done);
                    return "";
                }
            }
        }
        return String.format("Could not find a task with an ID of %d.\n", id);
    }

    public Map<String, List<Task>> getTasks() {
        return _tasks;
    }
}
