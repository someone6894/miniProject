package com.miniProj.service.board;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.miniProj.domain.BoardVo;

public interface BoardService {

	// Create
	// 게시판에 글 저장 하기
	boolean insertBoard(BoardVo bo) throws NamingException, SQLException;

	// Read
	// 게시판 전체 글 조회
	List<BoardVo> getAllBoard() throws NamingException, SQLException;

}
