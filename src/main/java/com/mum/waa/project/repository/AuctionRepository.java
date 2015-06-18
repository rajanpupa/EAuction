package com.mum.waa.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.waa.project.domain.Auction;

@Repository
public interface AuctionRepository extends CrudRepository<Auction, String>{

//	public Auction findOne(String id);
//	
//	public Iterable<Auction> findAll();
//	
//	public Auction save(Auction auction);
//	
//	public void delete(Auction auction);
	
}
