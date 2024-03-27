package com.codurance.training.tasks.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TaskList {
    private final Map<String, List<Task>> _tasks = new LinkedHashMap<>();
    private long lastId = 0;
    private static TaskList _instance = null;

    public static TaskList getInstance(){
        if(_instance == null){
            _instance = new TaskList();
        }
        return _instance;
    }

    private TaskList(){}


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

    public void setDone(Task task, boolean done){
        task.setDone(done);
    }

    public Map<String, List<Task>> getTasks() {
        return _tasks;
    }
}
