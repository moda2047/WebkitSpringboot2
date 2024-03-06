package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SampleService;

@RestController
public class LogController {

	@Autowired
	SampleService sampleService;
	
	@GetMapping("/log1")
	public String log1() {
		sampleService.doSomething();
		
		return "Log 1 테스트";
	}
	
	@GetMapping("/log2")
	public String log2() {
		sampleService.doSomething();
		
		return "결과 : "+sampleService.plus(100, 200);
	}
}
