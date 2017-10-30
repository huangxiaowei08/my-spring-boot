package com.example.myproject.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.service.ExampleService;

@Controller
public class ExampleController {

	@Autowired
	ExampleService exampleService;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return exampleService.query4Example();
	}

}
