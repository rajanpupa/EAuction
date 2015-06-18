package com.mum.waa.project.domain;

import javax.persistence.Entity;

@Entity
public class Bid {
	String username;
	String auctionId;
	Double bidAmount;
	
	public Bid(){}
	
	public Bid(String id, Double amount){
		this.auctionId = id;
		this.bidAmount = amount;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
	}
	public Double getBidAmount() {
		return bidAmount;
	}
	public void setBidAmount(Double bidAmount) {
		this.bidAmount = bidAmount;
	}
	
}
