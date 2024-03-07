package com.example.demo.controller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/find")
	public User findOne(@RequestParam(required = true) int id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody User user) {
    	userService.insertUser(user);
    }
    
	@PostMapping("/update")
	public void update(@RequestBody User user) {
		userService.updateUser(user);
	}
    
	@GetMapping("/delete")
	public void delete(int id) {
		userService.deleteUser(id);
	}
}
