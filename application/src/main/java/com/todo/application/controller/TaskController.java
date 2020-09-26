package com.todo.application.controller;

import com.todo.application.dto.TaskDetailDto;
import com.todo.application.service.TodoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TodoTaskService todoTaskService;

    @GetMapping(value = "/tasks")
    public ResponseEntity<List<TaskDetailDto>> getActiveTasks() {
        return ResponseEntity.ok(todoTaskService.getCurrentTasks());
    }
}
