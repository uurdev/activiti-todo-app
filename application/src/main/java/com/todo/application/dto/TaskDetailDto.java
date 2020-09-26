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

}
