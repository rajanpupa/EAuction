package com.mum.waa.project.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

@XmlRootElement 
@Entity(name="AUCTION")
public class Auction implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	@Id
	String id;
	
	@NotEmpty
	@Column
	@Size(min=5, max=200)
	String title;
	
	@NotEmpty
	String description;
	
	@OneToOne(cascade={CascadeType.ALL})
	Category category;
	
	@Range(min = 1)
	Double minExpectedAmount;
	
	@OneToOne(cascade = {CascadeType.ALL})
	Bid maxBid;
	
	@Transient
	Date createdDate;
	
	@Transient
	Date endDate;
	
	@Transient
	Boolean active=true;
	
	@JsonIgnore
	@Transient
	private MultipartFile  productImage;
	
	
	
	@OneToMany(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	List<Bid> BidList;
	
	

	public List<Bid> getBidList() {
		return BidList;
	}

	public void setBidList(List<Bid> bidList) {
		BidList = bidList;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlTransient  
	public MultipartFile getProductImage() {
		return productImage;
	}
	
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	public Double getMinExpectedAmount() {
		return minExpectedAmount;
	}

	public void setMinExpectedAmount(Double minExpectedAmount) {
		this.minExpectedAmount = minExpectedAmount;
	}

	public Bid getMaxBid() {
		return maxBid;
	}

	public void setMaxBid(Bid maxBid) {
		this.maxBid = maxBid;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
