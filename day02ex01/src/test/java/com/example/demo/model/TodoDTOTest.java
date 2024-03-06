package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.controller.HomeController;

class TodoDTOTest {
	private static final Logger logger = LogManager.getLogger(HomeController.class);
	
	private static TodoDTO todo = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		todo = new TodoDTO(1001, "연습", false);
		logger.info(">>>setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		logger.info(">>>tearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		logger.info(">>>setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		logger.info(">>>tearDown");
	}

	@Test
	void test() {
		logger.info(">>>test");
		System.out.println(todo);
	}

}
