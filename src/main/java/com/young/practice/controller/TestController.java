package com.young.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.young.practice.service.TestService;
import com.young.practice.vo.TestVO;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/testVO")
	@ResponseBody
	public TestVO testObject() {
		return new TestVO(1,"한사람",22);
	}
	
	@RequestMapping(value="/testText" , produces="text/plain;charset=utf-8")
	@ResponseBody
	public String testText() {
		return "한글qwerty`12345!@#$%";
	}

	@RequestMapping(value="/testDB")
	public String testDB(Model model) {
		model.addAttribute("today", testService.today());
		model.addAttribute("mul", testService.mul(12,34));
		model.addAttribute("sum", testService.sum(1,2,3));
		return "testDB";
	}
	
	
}
