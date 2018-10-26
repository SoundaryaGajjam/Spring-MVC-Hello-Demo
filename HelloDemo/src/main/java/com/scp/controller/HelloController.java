package com.scp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HelloController {

	@RequestMapping(value="/h",method=RequestMethod.GET)
	public String display(Model mdl){
		mdl.addAttribute("key","Hiiiiiiiiiiiii");
		return "hello";
	}
	
	
}
