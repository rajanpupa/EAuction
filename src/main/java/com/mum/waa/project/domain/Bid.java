package com.mum.waa.project.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Bid implements Serializable {
	@Id
	@Size(min=1, max=32)
	String username;
	
	@NotEmpty
	@NotNull
	String auctionId;
	
	@NotNull
	Double bidAmount;
	
	public Bid(){}
	
	public Bid(String username, String id, Double amount){
		this.username = username;
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
