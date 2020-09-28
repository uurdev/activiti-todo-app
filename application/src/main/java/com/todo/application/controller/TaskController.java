package com.todo.application.controller;

import com.todo.application.dto.TaskDetailDto;
import com.todo.application.service.TodoProcessService;
import com.todo.application.service.TodoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TodoTaskService todoTaskService;

    @Autowired
    private TodoProcessService todoProcessService;


    @GetMapping(value = "/tasks")
    public ResponseEntity<List<TaskDetailDto>> getActiveTasks() {
        return ResponseEntity.ok(todoTaskService.getCurrentTasks());
    }

    @PostMapping(value = "/new/task")
    public ResponseEntity<String> startNewTask(@RequestBody TaskDetailDto taskDetailDto) {
        return ResponseEntity.ok(todoProcessService.createNewTask(taskDetailDto));
    }

}
