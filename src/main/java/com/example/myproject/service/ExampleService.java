package com.example.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.domain.ExampleDao;

@Service
public class ExampleService {
	
	@Autowired
	ExampleDao exampleDao;
	
	public String query4Example(){
		return exampleDao.query4Example();
	}

}
