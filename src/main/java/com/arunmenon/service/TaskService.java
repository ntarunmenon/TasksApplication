package com.arunmenon.service;

import com.arunmenon.domain.Task;

public interface TaskService {

	 Iterable<Task> listTasks();
	
	Task save(Task task);
}
