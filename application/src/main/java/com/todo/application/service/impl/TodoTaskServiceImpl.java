package com.todo.application.service.impl;

import com.todo.application.dto.TaskDetailDto;
import com.todo.application.service.TodoTaskService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoTaskServiceImpl implements TodoTaskService {


    @Autowired
    private TaskService taskService;


    @Override
    public List<TaskDetailDto> getCurrentTasks() {
        List<Task> resultTaskList = taskService.createTaskQuery().active().list();
        List<TaskDetailDto> taskDetailDtoList = new ArrayList<TaskDetailDto>();

        for (Task task : resultTaskList) {
            TaskDetailDto tempTaskDetailDto = new TaskDetailDto();
            tempTaskDetailDto.setTaskId(task.getId());
            tempTaskDetailDto.setTaskCompletedTime(task.getDueDate());
            tempTaskDetailDto.setTaskCreatedTime(task.getCreateTime());
            tempTaskDetailDto.setTaskDetail(task.getDescription());
            tempTaskDetailDto.setTaskNote(task.getName());
            tempTaskDetailDto.setTaskOwnerMail(task.getOwner());
            taskDetailDtoList.add(tempTaskDetailDto);
        }
        return taskDetailDtoList;

    }
}
