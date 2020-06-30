package com.young.practice.dao;

import java.util.List;

import com.young.practice.vo.BoardVO;

public interface BoardDAO {
	public int selectCount();
	public BoardVO selectByIdx(int idx);
	public List<BoardVO> selectList();
	public int insert(BoardVO vo);
	public int update(BoardVO vo);
	public int delete(int idx);
}
