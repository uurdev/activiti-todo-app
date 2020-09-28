package com.todo.application.service.impl;

import com.todo.application.dto.TaskDetailDto;
import com.todo.application.service.TodoProcessService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TodoProcessServiceImpl implements TodoProcessService {
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private RuntimeService runtimeService;
    @Override
    public String createNewTask(TaskDetailDto taskDetailDto) {

        String currentTaskProcess=deployedProcess();
        Map<String ,Object> taskVariables=new HashMap<String, Object>();
        taskVariables.put("taskDetail",taskDetailDto);
        System.out.println("Deployed process : "+ currentTaskProcess);

       ProcessInstance processInstance= runtimeService.startProcessInstanceByKey(currentTaskProcess,taskVariables);


        return processInstance.getName();
    }

    private String deployedProcess() {
        Deployment deployment = repositoryService.createDeployment().addClasspathResource("processes/task-process-bpmn20.xml").deploy();

        return deployment.getKey();
    }
}
