package com.miniProj.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CommenExceptionProcess {
	private static Logger logger = LoggerFactory.getLogger(CommenExceptionProcess.class);
	
//	@ExceptionHandler(Exception.class)
//	public String commonExceptionHandler(Exception e, Model model) {
//		logger.info("예외처리 이동");
//		
//		model.addAttribute("error", e);
//		
//		return "commonError"; //commonError.jsp로 페이지 이동
//	}

	@ExceptionHandler(Exception.class)
	public ModelAndView commonExceptionHandler(Exception e) {
		logger.info("예외처리 이동");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("commonError");
		mav.addObject("error", e);
		
		return mav;
		
	}
}
