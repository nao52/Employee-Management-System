package com.example.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.domain.MUser;
import com.example.service.UserService;

@SpringBootTest
class UserServiceImplTest {

	@Autowired
	UserService userService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("新規ユーザー登録")
	void signupIsSuccess() {
		Integer countUser1 = userService.getUsers().size();
		Date date = new Date();
		MUser newUser1 = new MUser();
		newUser1.setUserId("test@net.com");
		newUser1.setPassword("password");
		newUser1.setUserName("Taro");
		newUser1.setBirthday(date);
		newUser1.setAge(20);
		newUser1.setGender(1);
		userService.signup(newUser1);
		Integer countUser2 = userService.getUsers().size();
		assertEquals(countUser1 + 1, countUser2);
	}

}
