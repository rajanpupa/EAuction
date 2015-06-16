package com.mum.waa.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.waa.project.service.AuctionService;

@Controller
//@RequestMapping("/")
public class WelcomeController {
	
	@Autowired
	AuctionService auctionService;
	
	@RequestMapping(value={"/","/welcome"}, method = RequestMethod.GET)
	public String welcomePage(Model model){
		
		model.addAttribute("auctions", auctionService.getAllAuctions());
		return "Welcome";
	}
	
	@RequestMapping("/auctionDetail/{pid}")
	public String auctionDetail(Model model, @PathVariable("pid") String pid){
		
		model.addAttribute("auction", auctionService.getAuctionById(pid));
		return "AuctionDetail";
	}

	@RequestMapping("/test")
	public String testPage(){
		return "Test";
	}
	
}
