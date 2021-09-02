package com.miniProj.service.board;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.naming.NamingException;

import org.springframework.stereotype.Service;

import com.miniProj.domain.BoardVo;
import com.miniProj.presistence.board.BoardDao;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDao dao;
	
	@Override
	public boolean insertBoard(BoardVo bo) throws NamingException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BoardVo> getAllBoard() throws NamingException, SQLException {
		return dao.selectAllBoard();
	}

}
