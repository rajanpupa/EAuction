package com.mum.waa.project.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
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
	
	@Query("select a from AUCTION a join a.category c where c.name=:categoryName")
	public Iterable<Auction> findAuctionByCategoryName(@Param("categoryName")String categoryName);
	
}
