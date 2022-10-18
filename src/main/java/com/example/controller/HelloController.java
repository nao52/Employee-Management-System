package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Employee;
import com.example.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService service;

	@GetMapping("/hello")
	public String getHello() {
		// hello.html に画面遷移
		return "tutorial/hello";
	}

	@PostMapping("/hello/db")
	public String postDbRequest(@RequestParam("id") String id, Model model) {
		// 1件検索
		Employee employee = service.getEmployee(id);
		// 検索結果をModelに登録
		model.addAttribute("employee", employee);
		// db.htmlに画面遷移
		return "tutorial/db";
	}

}
