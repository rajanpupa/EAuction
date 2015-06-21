package com.mum.waa.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.domain.Category;
import com.mum.waa.project.service.AuctionService;
import com.mum.waa.project.service.CategoryService;

@Controller
public class SearchController {
	@Autowired
	AuctionService auctionService;
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/search")
	public String Search(
			@RequestParam("categories") Integer category, 
			@RequestParam("searchText") String search,
			Model model
			)
	{
		if(category==0){//all
			model.addAttribute("auctions",filterBySearchText(auctionService.getAllAuctions(), search));
			return "searchResult";
		}
		
		Category categoryObj = categoryService.getCategoryById(category);
		Iterable<Auction> filteredAuctions = auctionService.getAuctionByCategory(categoryObj.getName());
		
		model.addAttribute("auctions",filterBySearchText(filteredAuctions, search));
		
		return "searchResult";
	}
	
	public Iterable<Auction> filterBySearchText(Iterable<Auction> auctions, String searchText){
		List<Auction> result = new ArrayList<Auction>();
		
		searchText = searchText.trim();
		if(searchText == null || searchText.length()==0){
			return auctions;
		}
		
		for (Auction a : auctions) {
			if (a.getTitle().toLowerCase().contains(searchText.toLowerCase())) {
				result.add(a);
			}
		}
		
		return result;
	}
	
	@RequestMapping("/search/category/{category}")
	public String searchCategory(@PathVariable("category") String category, Model model){

		System.out.println("inside the search by category method");
		Iterable<Auction> auctions = auctionService.getAuctionByCategory(category);
		
		if(auctions == null){
			System.out.println("auctions is null");
		}else{
			System.out.println("auctions is not null");
		}
		model.addAttribute("auctions", auctions);
		
		return "searchResult";
	}
	
	@ModelAttribute("categories")
	public Iterable<Category> getAllCategories() {
		return categoryService.getAllCategory();
	}

	
}
