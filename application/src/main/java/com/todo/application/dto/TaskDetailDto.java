package com.todo.application.dto;

import org.activiti.bpmn.model.UserTask;
import org.activiti.engine.task.Task;

import java.util.Date;

public class TaskDetailDto {

    private String taskId;

    private Date taskCreatedTime;

    private Date taskCompletedTime;

    private String taskDetail;

    private String taskNote;

    private String taskOwnerMail;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Date getTaskCreatedTime() {
        return taskCreatedTime;
    }

    public void setTaskCreatedTime(Date taskCreatedTime) {
        this.taskCreatedTime = taskCreatedTime;
    }

    public Date getTaskCompletedTime() {
        return taskCompletedTime;
    }

    public void setTaskCompletedTime(Date taskCompletedTime) {
        this.taskCompletedTime = taskCompletedTime;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public String getTaskNote() {
        return taskNote;
    }

    public void setTaskNote(String taskNote) {
        this.taskNote = taskNote;
    }

    public String getTaskOwnerMail() {
        return taskOwnerMail;
    }

    public void setTaskOwnerMail(String taskOwnerMail) {
        this.taskOwnerMail = taskOwnerMail;
    }
}
