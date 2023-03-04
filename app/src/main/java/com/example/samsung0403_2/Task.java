package com.example.samsung0403_2;

// Класс объекта

public class Task {
    private String taskName;
    private String taskDesc;
    private Boolean isComplete;

    public Task(String taskName, String taskDesc, Boolean isComplete) {
        this.taskName = taskName;
        this.taskDesc = taskDesc;
        this.isComplete = isComplete;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }
}
