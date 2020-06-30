package com.young.practice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.young.practice.dao.BoardDAO;
import com.young.practice.vo.BoardVO;

@Service
public class BoardService {
	@Autowired
	private BoardDAO boardDAO;
	static Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	public BoardVO selectByIdx(int idx) {
		logger.info("BoardService.selectList:"+idx);
		BoardVO vo = null;
		try {
			vo = boardDAO.selectByIdx(idx);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		logger.info("BoardService.selectList:"+vo);
		return vo;
	}
	public List<BoardVO> selectList() {
		List<BoardVO> list = null;
		try {
			list = boardDAO.selectList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void insert(BoardVO vo) {
		try {
			if(vo != null) {
				boardDAO.insert(vo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void update(BoardVO vo) {
		try {
			vo.setSubject(vo.getSubject().trim());
			vo.setContent(vo.getContent().trim());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(BoardVO vo) {
		try {
			if(vo!=null) {
				BoardVO dbVO = boardDAO.selectByIdx(vo.getIdx());
				if(dbVO!=null) {
					boardDAO.delete(vo.getIdx());
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
