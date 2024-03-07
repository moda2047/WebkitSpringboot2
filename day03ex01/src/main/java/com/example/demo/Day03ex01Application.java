package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class Day03ex01Application {

	public static void main(String[] args) {
		SpringApplication.run(Day03ex01Application.class, args);
	}

}
