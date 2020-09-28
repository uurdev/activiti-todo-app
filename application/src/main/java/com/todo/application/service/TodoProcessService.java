package com.todo.application.service;

import com.todo.application.dto.TaskDetailDto;

public interface TodoProcessService {

    public String createNewTask(TaskDetailDto taskDetailDto);
}
