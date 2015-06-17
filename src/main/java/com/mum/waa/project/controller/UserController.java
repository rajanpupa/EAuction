package com.mum.waa.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.domain.Bid;
import com.mum.waa.project.domain.Category;
import com.mum.waa.project.domain.Message;
import com.mum.waa.project.service.AuctionService;
import com.mum.waa.project.service.CategoryService;

@Controller
public class UserController {
	@Autowired
	AuctionService auctionService;
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value="/makebidtest",produces="application/json", method=RequestMethod.GET)
	public @ResponseBody Message makeBid(){
		Auction auction = auctionService.getAuctionById("P0001");
		
		Message message = new Message();
		
		if(auction==null){
			message.setPass(false);
		}else{
			message.setPass(true);
		}
		return message;
	}
	
	@RequestMapping(value="/makebid", method=RequestMethod.POST)
	public @ResponseBody Message makeBid(@RequestBody Bid bid){
		String id = bid.getAuctionId();
		Double amount = bid.getBidAmount();
		
		System.out.println("id=" + id + " amount=" +amount);
		Auction auction = auctionService.bid(id, amount);
		Message message = new Message();
		if(auction == null){
			message.setPass(false);
			message.setMessage("Bidding Failed");
		}else{
			message.setPass(true);
			message.setMessage("Bidding succeed");
			message.setResult(auction.getMaxBidAmount().toString());
		}
		return message;
	}
	
	@RequestMapping("/createAuction")
	public String createAuction(@ModelAttribute("auction") Auction auction,Model model) {
		//model.addAttribute("auctions", auctionService.getAllAuctions());
		return "user/createAuction";
	}
	
	@RequestMapping("/saveAuction")
	public String saveAuction(@ModelAttribute("auction") Auction auction, Model model) {
		auctionService.saveAuction(auction); 
		model.addAttribute("auctions", auctionService.getAllAuctions());
		return "Welcome";
	}
	
	@ModelAttribute("categories")
	public Iterable<Category> getAllCategories(){
		return categoryService.getAllCategory();
	}
	
}
