package com.arunmenon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arunmenon.domain.Task;
import com.arunmenon.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepsitory;
	
	@Override
	public Iterable<Task> listTasks() {
		return taskRepsitory.findAll();
	}

	@Override
	public Task save(Task task) {
		return taskRepsitory.save(task);
	}

}
