package com.example.myfirstjava_app;

public class TaskModel {
    private String id;
    private String name;

    public TaskModel() {
    }

    public TaskModel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
