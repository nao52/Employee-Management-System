package com.example.form;

import java.util.Date;

import com.example.domain.Department;

import lombok.Data;

@Data
public class UserDetailForm {

	private String userId;
	private String password;
	private String userName;
	private Date birthday;
	private Integer age;
	private Integer gender;
	private Department department;

}
