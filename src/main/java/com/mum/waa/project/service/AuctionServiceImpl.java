package com.mum.waa.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.domain.Bid;
import com.mum.waa.project.repository.AuctionRepository;

@Service
@Transactional
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
		return auctionRepository.findOne(auctionId);
	}

	@Override
	public void saveAuction(Auction auction) {
		auctionRepository.save(auction);
	}

	@Override
	public void deleteAuction(Auction auction) {
		auctionRepository.delete(auction);
	}

	@Override
	public void disableAuction(Auction auction) {
		auction.setActive(false);
		
		auctionRepository.save(auction);
	}

	@PreAuthorize("hasRole('ROLE_USER')")
	@Override
	public Auction bid(String auctionId, Double bidAmount, String userName) {
		
		System.out.println("Inside Bid");
		
		Auction auction = auctionRepository.findOne(auctionId);
		if(auction == null){
			System.out.println("the auction is not found.");
			return null;
		}else if(bidAmount > auction.getMaxBid().getBidAmount()){
			auction.getMaxBid().setBidAmount(bidAmount);
			auction.setMinExpectedAmount(bidAmount);
			
			System.out.println("bid amount set to " + auction.getMaxBid().getBidAmount());
			
			//
			
			Bid bid = new Bid(userName, auctionId, bidAmount);
	         auction.getBidList().add(bid);
			auctionRepository.save(auction);
			
			
			
			return auction;
		}else{
			return null;
		}
	}

	@Override
	public Iterable<Auction> getAuctionByCategory(String category) {
		// TODO Auto-generated method stub
		return auctionRepository.findAuctionByCategoryName(category);
	}

}
