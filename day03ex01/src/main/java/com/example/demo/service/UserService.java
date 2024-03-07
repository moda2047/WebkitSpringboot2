package com.example.demo.service;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService (UserMapper userMapper) {
        this.userMapper= userMapper;
    }
    
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    
    public User getUserById(int id) {
		return userMapper.getUserById(id);
	}
	
	
    public void insertUser(User user) {
    	userMapper.insertUser(user);
    }
    

    public void updateUser(User user) {
		userMapper.updateUser(user);
	}
    

    public void deleteUser(int id) {
		userMapper.deleteUser(id);
	}

}

