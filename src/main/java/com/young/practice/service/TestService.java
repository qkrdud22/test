package com.young.practice.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.young.practice.dao.TestDAO;

@Service
public class TestService {
	
	
	@Autowired
	private TestDAO testDAO;
	
	public String today() {
		return testDAO.today();
	}
	public int mul(int num1,int num2) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("num1", num1);
		map.put("num2", num2);
		return testDAO.mul(map);
		
	}
	public int sum(int num1,int num2,int num3) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("num1", num1);
		map.put("num2", num2);
		map.put("num3", num3);
		return testDAO.sum(map);
	}
}
