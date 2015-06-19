package com.mum.waa.project.controller;

import java.io.File;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.domain.Bid;
import com.mum.waa.project.domain.Category;
import com.mum.waa.project.domain.Message;
import com.mum.waa.project.service.AuctionService;
import com.mum.waa.project.service.CategoryService;

@Controller
@RequestMapping("/user")
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
	
	@RequestMapping(value="/makebid",produces="application/json", method=RequestMethod.POST)
	public @ResponseBody Message makeBid(@RequestBody Bid bid, Principal principal){
		final String username=principal.getName();
		bid.setUsername(username);
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
			message.setResult(auction.getMaxBid().getBidAmount().toString());
		}
		return message;
	}
	
	@RequestMapping("/createAuction")
	public String createAuction(@ModelAttribute("auction") Auction auction,Model model) {
		model.addAttribute("categories", categoryService.getAllCategory());
		return "createAuction";
	}
	
	@RequestMapping(value="/saveAuction", method=RequestMethod.POST)
	public String saveAuction(
			@ModelAttribute("auction") Auction auction,Model model,Principal principal,
			HttpServletRequest request	) {
		final String currentUser = principal.getName();
		
		System.out.println("Auction Id = " + auction.getId());
		System.out.println("Auction Title = " + auction.getTitle());
		
		Bid bid = auction.getMaxBid();
		if(bid!=null){
			bid.setUsername(currentUser);
		}else{
			bid=new Bid(currentUser, auction.getId(), auction.getMinExpectedAmount());
			auction.setMaxBid(bid);
		}
		
		MultipartFile productImage = auction.getProductImage();
		String rootDirectory = request.getSession().getServletContext()
				.getRealPath("/");

		if (productImage != null && !productImage.isEmpty()) {
			try {
				productImage.transferTo(new File(rootDirectory
						+ "\\resources\\images\\"
						+ auction.getId() + ".png"));
			} catch (Exception e) {
				throw new RuntimeException("Product Image saving failed", e);
			}
		}
		Category category = auction.getCategory();
		if(category==null){
			System.out.println("category is null");
		}
		Category dbCategory = categoryService.getCategoryById(category.getId());
		auction.setCategory(dbCategory);
		
		auctionService.saveAuction(auction); 
		model.addAttribute("auctions", auctionService.getAllAuctions());
		return "Dashboard";
	}
	
	@RequestMapping(value="/saveAuction", method=RequestMethod.GET)
	public @ResponseBody String getAuction( ) {
		
		return "I am working all rights";
	}
	
	@ModelAttribute("categories")
	public Iterable<Category> getAllCategories(){
		return categoryService.getAllCategory();
	}
	
	@RequestMapping("/dashboard")
	public String dashBoard()
	{
		
		return "Dashboard";
	}
	
	@RequestMapping("/test")
	public @ResponseBody String test()
	{
		System.out.println("I am here");
		
		return "This method is working";
	}
	
}
