package com.arunmenon.repository;

import org.springframework.data.repository.CrudRepository;

import com.arunmenon.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
