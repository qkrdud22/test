package com.young.practice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.young.practice.service.BoardService;
import com.young.practice.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/test")
	public String home(Model model, HttpServletRequest request) {
		List<BoardVO> list = boardService.selectList();
		model.addAttribute("list",list);
		return "test";
	}
}
