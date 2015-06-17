package com.mum.waa.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.waa.project.domain.Auction;

@Repository
public interface AuctionRepository extends CrudRepository<Auction, String>{

	public Auction findAuctionById(String id);
	
	public Iterable<Auction> findAllAuctions();
	
	public void saveAuction(Auction auction);
	
	public void removeAuction(Auction auction);
}
