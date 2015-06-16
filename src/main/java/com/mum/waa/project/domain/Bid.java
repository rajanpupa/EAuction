package com.mum.waa.project.domain;

import javax.persistence.Entity;

@Entity
public class Bid {
	String auctionId;
	Double bidAmount;
	
	public Bid(){}
	
	public Bid(String id, Double amount){
		this.auctionId = id;
		this.bidAmount = amount;
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
