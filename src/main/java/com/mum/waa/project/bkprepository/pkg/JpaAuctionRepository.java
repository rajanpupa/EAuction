package com.mum.waa.project.bkprepository.pkg;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mum.waa.project.domain.Auction;
import com.mum.waa.project.repository.AuctionRepository;

//@Repository
public interface JpaAuctionRepository extends AuctionRepository{
	
	@Query("select a from Auction a where id= :id")
	public Auction findOne(String id);
	
	@Query("select a from Auction a ")
	public Iterable<Auction> findAll();
	
	public Auction save(Auction auction);
	
	public void delete(Auction auction);
}
