package com.mum.waa.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
	
	
	@RequestMapping("/search")
	public String Search(@RequestParam("catergory") String category, @RequestParam("search") String search)
	{
		
		return null;
	}

	
}
