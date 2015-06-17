package com.mum.waa.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.domain.Bid;
import com.mum.waa.project.domain.Category;
import com.mum.waa.project.service.AuctionService;
import com.mum.waa.project.service.CategoryService;

@Controller
//@RequestMapping("/")
public class WelcomeController {
	
	@Autowired
	AuctionService auctionService;
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value={"/","/welcome"}, method = RequestMethod.GET)
	public String welcomePage(Model model){
		
		System.out.println(categoryService.getAllCategory());

		
		model.addAttribute("categories",categoryService.getAllCategory());

		model.addAttribute("categories",categoryService.getAllCategory());
		

		model.addAttribute("auctions", auctionService.getAllAuctions());
		return "welcome";
	}
	
	@RequestMapping("/auctionDetail/{pid}")
	public String auctionDetail(Model model, @PathVariable("pid") String pid){
		Auction auction = auctionService.getAuctionById(pid);
		model.addAttribute("auction", auction);
		model.addAttribute("bid", new Bid(auction.getId(), auction.getMaxBidAmount() + 1));
		return "auctionDetail";
	}

	@RequestMapping("/test")
	public String testPage(){
		return "Test";
	}
	
	@ModelAttribute("categories")
	public Iterable<Category> getAllCategories(){
		return categoryService.getAllCategory();
	}
	
}
