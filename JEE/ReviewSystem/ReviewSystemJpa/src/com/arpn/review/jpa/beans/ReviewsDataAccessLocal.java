package com.arpn.review.jpa.beans;

import java.util.List;

import javax.ejb.Local;

import com.arpn.review.jpa.domain.Reviews;

@Local
public interface ReviewsDataAccessLocal {

	void addReview(final String userName, final String productName, final String comment, final int rating);
	
	List<Reviews> listReviews();
}
