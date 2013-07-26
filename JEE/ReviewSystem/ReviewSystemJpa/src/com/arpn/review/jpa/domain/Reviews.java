package com.arpn.review.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reviews",schema="APP")
public class Reviews {

	private long reviewId;
	private String userName;
	private String productName;
	private String comment;
	private int rating;
	
	public Reviews() {
		// TODO Auto-generated constructor stub
	}
	
	public Reviews(final String userName, final String productName, final String comment, final int rating){
		this.userName = userName;
		this.productName = productName;
		this.comment = comment;
		this.rating = rating;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getReviewId() {
		return reviewId;
	}
	
	private void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
