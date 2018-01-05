package com.arunmenon;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.arunmenon.domain.Task;
import com.arunmenon.service.TaskService;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(TaskService service){
		return args -> {
			service.save(new Task(1L,"Create Spring Boot",LocalDate.now(),true));
			service.save(new Task(2L,"Test task 2",LocalDate.now().plus(1, ChronoUnit.DAYS),false));
			service.save(new Task(3L,"Test task 3",LocalDate.now().plus(1, ChronoUnit.DAYS),false));
			service.save(new Task(4L,"Test task 4",LocalDate.now(),false));
			service.save(new Task(5L,"Test task 5",LocalDate.now(),false));
		};
	}
}
