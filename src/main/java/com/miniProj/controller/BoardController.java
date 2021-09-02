package com.miniProj.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.miniProj.domain.BoardVo;
import com.miniProj.service.board.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardService service;
	
	private static Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception { // 주소가 /board/listAll 임 
		logger.info("전체 게시물 출력...");
		List<BoardVo> lst = service.getAllBoard();
		System.out.println(lst);
		model.addAttribute("listBoard", lst);
		
	}
	
	
	
}
