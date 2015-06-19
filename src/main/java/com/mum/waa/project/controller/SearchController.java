package com.mum.waa.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.service.AuctionService;

@Controller
public class SearchController {
	@Autowired
	AuctionService auctionService;
	
	@RequestMapping("/search")
	public String Search(
//			@RequestParam("categories") String category, 
//			@RequestParam("searchText") String search,
			Model model
			)
	{
		
		String search="xps";
		auctionService.getAllAuctions();
		
		List<Auction> result = new ArrayList<Auction>();
		
		for(Auction a : auctionService.getAllAuctions()){
			if(a.getTitle().contains(search)){
				result.add(a);
			}
		}
		
		model.addAttribute("auctions", result);
		
		return "welcome";
	}

	
}
