package com.arpn.review.web.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="reviews")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReviewView {

	@XmlElement(required=true)
	private long reviewId;
	
	@XmlElement(required=true)
	private String userName;
	
	@XmlElement(required=true)
	private String productName;
	
	@XmlElement(required=true)
	private String comment;
	
	@XmlElement(required=true)
	private int rating;
	
	public ReviewView() {
		// TODO Auto-generated constructor stub
	}
	
	public ReviewView(final long reviewId, final String userName, final String productName, final String comment, final int rating){
		this.reviewId = reviewId;
		this.userName = userName;
		this.productName = productName;
		this.comment = comment;
		this.rating = rating;
	}
	
	
	public long getReviewId() {
		return reviewId;
	}
	
	public void setReviewId(long reviewId) {
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
