package com.mum.waa.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		return auctionService.bid(bid.getProductId(), bid.getBidAmount());
	}

	
}
