package com.mum.waa.project.service;

import java.util.List;

import com.mum.waa.project.domain.Auction;

public interface AuctionService {
	public Iterable<Auction> getAllAuctions();
	
	public Auction getAuctionById(String auctionId);
	
	public void saveAuction(Auction auction);
	
	// not good idea to use this
	public void deleteAuction(Auction auction);
	
	public void disableAuction(Auction auction);
	
	public Auction bid(String auctionId, Double bidAmount);
	
	public Iterable<Auction> getAuctionByCategory(String category);
}
