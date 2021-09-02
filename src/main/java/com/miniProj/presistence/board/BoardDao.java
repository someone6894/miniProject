package com.miniProj.presistence.board;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.naming.NamingException;

import com.miniProj.domain.BoardVo;

public interface BoardDao {

	
		// Create
		// 게시판에 글 저장 하기
		int insertBoard(BoardVo bo) throws NamingException, SQLException;
		
		// Read
		// 게시판 전체 글 조회 
		List<BoardVo> selectAllBoard() throws NamingException, SQLException;
		
		
}
