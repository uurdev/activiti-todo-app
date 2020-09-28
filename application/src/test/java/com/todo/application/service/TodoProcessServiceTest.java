package com.todo.application.service;

import com.todo.application.dto.TaskDetailDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

//@ExtendWith(MockitoExtension.class)
public class TodoProcessServiceTest {

    @InjectMocks
    private TodoProcessService todoProcessService;

    //@Test
    void createNewTaskTest(){
        TaskDetailDto dto=new TaskDetailDto();
        dto.setTaskOwnerMail("xyz@gmail.com");
        dto.setTaskNote("test task note");
        dto.setTaskDetail("test task detail");
        dto.setTaskCreatedTime(new Date());
        //TODO assertleri import edemıyor !!
        //assertThat(todoProcessService.createNewTask(dto)
    }
}
