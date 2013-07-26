package com.arpn.review.ejb;

import java.util.List;

import javax.ejb.Local;

import com.arpn.review.jpa.domain.Reviews;

@Local
public interface ReviewServiceLocal {

	List<Reviews> listReviews() throws Exception;
	
	String addReview(final String userName, final String productName, final String comment, final int rating);
}
