package com.mum.waa.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.repository.AuctionRepository;

@Service
public class AuctionServiceImpl implements AuctionService{

	@Autowired
	AuctionRepository auctionRepository;
	
	

	@Override
	public Iterable<Auction> getAllAuctions() {
		// TODO Auto-generated method stub
		return auctionRepository.findAll();
	}

	@Override
	public Auction getAuctionById(String auctionId) {
		// TODO Auto-generated method stub
		return auctionRepository.findAuctionById(auctionId);
	}

	@Override
	public void saveAuction(Auction auction) {
		auctionRepository.saveAuction(auction);
	}

	@Override
	public void deleteAuction(Auction auction) {
		auctionRepository.removeAuction(auction);
	}

	@Override
	public void disableAuction(Auction auction) {
		auction.setActive(false);
		
		auctionRepository.saveAuction(auction);
	}

	@Override
	public Auction bid(String auctionId, Double bidAmount) {
		
		Auction auction = auctionRepository.findAuctionById(auctionId);
		if(auction == null){
			System.out.println("the auction is not found.");
			return null;
		}else if(bidAmount > auction.getMaxBidAmount()){
			auction.setMaxBidAmount(bidAmount);
			
			System.out.println("bid amount set to " + auction.getMaxBidAmount());
			auctionRepository.saveAuction(auction);
			return auction;
		}else{
			return null;
		}
	}

}
