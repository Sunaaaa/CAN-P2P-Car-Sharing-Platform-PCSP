package com.pcsp.MyPcsp.dashBoard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashBoardController {

	@RequestMapping(value="/")
	public ModelAndView DashBoardView(ModelAndView mv) throws Exception{
		
		mv.setViewName("dashBoard/dashBoard");
		return mv;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView LoginView(ModelAndView mv) throws Exception{
		
		mv.setViewName("dashBoard/login");
		return mv;
	}
	
}
