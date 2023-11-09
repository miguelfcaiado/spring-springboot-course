package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResouce {

	private TodoService todoService;
	
	public TodoResouce(TodoService todoService) {
		this.todoService = todoService;
	}
	
	 @GetMapping("/users/{username}/todos")
	 public List<Todo> retrieveTodos(@PathVariable String username) {
		 return todoService.findByUsername(username);
	 }
}
