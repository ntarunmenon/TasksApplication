package com.arunmenon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arunmenon.domain.Task;
import com.arunmenon.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping(value={"","/"})
	public Iterable<Task> listTasks(){
		return taskService.listTasks();
	}
	
	@PostMapping("/save")
	public Task save(@RequestBody Task task){
		return taskService.save(task);
		
	}
	
}
