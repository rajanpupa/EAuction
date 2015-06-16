package com.mum.waa.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.domain.Bid;
import com.mum.waa.project.service.AuctionService;

@Controller
public class UserController {
	@Autowired
	AuctionService auctionService;
	
	@RequestMapping(value="/makebid", method=RequestMethod.PUT)
	public @ResponseBody Auction makeBid(Model model, Bid bid){
		
		return auctionService.bid(bid.getAuctionId(), bid.getBidAmount());
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
	

	
}
