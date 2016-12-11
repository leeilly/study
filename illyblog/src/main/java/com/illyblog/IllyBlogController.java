package com.illyblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IllyBlogController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String main(){
		return "/home";
	}
}
