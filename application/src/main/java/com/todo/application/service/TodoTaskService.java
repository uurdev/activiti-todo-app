package com.todo.application.service;

import com.todo.application.dto.TaskDetailDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoTaskService {
    public List<TaskDetailDto> getCurrentTasks();
}
