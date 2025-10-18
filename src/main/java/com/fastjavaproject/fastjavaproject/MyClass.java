package com.fastjavaproject.fastjavaproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
  @GetMapping("/hello")
	public String hello() {
		return "wello  to backend World!";
	}

    @PostMapping("/post")
	public String post() {
		return "Post request";

	}
}
