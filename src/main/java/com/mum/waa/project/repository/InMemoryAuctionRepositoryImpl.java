package com.mum.waa.project.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mum.waa.project.domain.Auction;

@Repository
public class InMemoryAuctionRepositoryImpl implements AuctionRepository{

	Map<String,Auction> auctionsList = new HashMap<String, Auction>();
	
	public InMemoryAuctionRepositoryImpl(){
		Auction auction1 = new Auction();
		
		auction1.setId("P0001");
		auction1.setTitle("Xps Laptop Third generation, 256SSD 8GB Ram i7");
		auction1.setDescription("This laptop is covered by the Dell's In Home Service warranty until 4/2016. If Dell Tech Support is not able to resolve your issue via chat/phone they will send a Dell Certified Technician to your location in 1-2 business days to resolve the issue. This is the same warranty that Dell gives with a brand new laptop so you can be confident that you are protected.  After your purchase we shall email you instructions to transfer the warranty. The warranty can also be upgraded directly through Dell");
		
		Auction auction2 = new Auction();
		
		auction2.setId("P0002");
		auction2.setTitle("Lenovo Laptop Third generation, 256SSD 8GB Ram i7");
		auction2.setDescription("This laptop is covered by the Dell's In Home Service warranty until 4/2016. If Dell Tech Support is not able to resolve your issue via chat/phone they will send a Dell Certified Technician to your location in 1-2 business days to resolve the issue. This is the same warranty that Dell gives with a brand new laptop so you can be confident that you are protected.  After your purchase we shall email you instructions to transfer the warranty. The warranty can also be upgraded directly through Dell");
		
		auctionsList.put(auction1.getId(), auction1);
		auctionsList.put(auction2.getId(), auction2);
	}
	
	@Override
	public long count() {
		return auctionsList.size();
	}

	@Override
	public void delete(String auctionId) {
		auctionsList.remove(auctionId);
	}

	@Override
	public void delete(Auction auction) {
		auctionsList.remove(auction.getId());
	}

	@Override
	public void delete(Iterable<? extends Auction> arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		auctionsList.clear();
	}

	@Override
	public boolean exists(String auctionId) {
		if(auctionsList.get(auctionId)!=null){
			return true;
		}
		
		return false;
	}

	@Override
	public Iterable<Auction> findAll() {
		// TODO Auto-generated method stub
		return findAllAuctions();
	}

	@Override
	public Iterable<Auction> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auction findOne(String key) {
		// TODO Auto-generated method stub
		return auctionsList.get(key);
	}

	@Override
	public <S extends Auction> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Auction> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auction findAuctionById(String id) {
		// TODO Auto-generated method stub
		return findOne(id);
	}

	@Override
	public Iterable findAllAuctions() {
		// TODO Auto-generated method stub
		List<Auction> aList = new ArrayList<Auction>();
		
		for(String key: auctionsList.keySet()){
			aList.add(auctionsList.get(key));
		}
		
		return aList;
	}

	@Override
	public void saveAuction(Auction auction) {
		// TODO Auto-generated method stub
		auctionsList.put(auction.getId(), auction);
	}

	@Override
	public void removeAuction(Auction auction) {
		// TODO Auto-generated method stub
		auctionsList.remove(auction.getId());
	}

}
