package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.User;

//인터페이스에 `@Mapper` 어노테이션을 붙여야 MyBatis가 이를 스캔하여 구현체를 생성
@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM Users")
    List<User> getAllUsers();
    
	@Select("SELECT * FROM Users where id = #{id}")
	User getUserById(int id);
	
	@Insert("INSERT INTO Users(username, email) VALUES ( #{username}, #{email})")
    void insertUser(User user);
    
	@Update("UPDATE users SET username=#{username}, email=#{email} WHERE id={#id}")
	void updateUser(User user);
    
	@Delete("DELETE FROM users WHERE ID=#{id")
	void deleteUser(int id);
}