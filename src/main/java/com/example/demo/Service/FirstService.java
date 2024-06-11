package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.FirstRepo;

@Service
public class FirstService {
	
	@Autowired
	private FirstRepo repo;
	
	public String s1() {
		
		return repo.m1();
		
	}

}
