package com.arpn.review.ejb;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.arpn.review.jpa.beans.ReviewsDataAccessLocal;
import com.arpn.review.jpa.domain.Reviews;

/**
 * Session Bean implementation class ReviewService
 */
@Stateless
public class ReviewService implements ReviewServiceLocal {

	
	@EJB
	private ReviewsDataAccessLocal reviewsDataAccess;
	
    /**
     * Default constructor. 
     */
    public ReviewService() {
        // TODO Auto-generated constructor stub
    }

    
	@Override
	public List<Reviews> listReviews() throws Exception {
		if(reviewsDataAccess == null) {
			throw new Exception("Failed to initialize JPA Service EJB");
		}
		
		return reviewsDataAccess.listReviews();
	}


	@Override
	public String addReview(String userName, String productName, String comment,
			int rating) {
		if(reviewsDataAccess == null) {
			return "Failed to initialize JPA Service EJB";
		}
		
		reviewsDataAccess.addReview(userName, productName, comment, rating);
		return String.format("User %1$s gave rating %2$s for Product %3$s.", userName,
				rating,productName);
	}

}
