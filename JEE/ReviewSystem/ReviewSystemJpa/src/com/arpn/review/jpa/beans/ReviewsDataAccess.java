package com.arpn.review.jpa.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.arpn.review.jpa.domain.Reviews;

/**
 * Session Bean implementation class ReviewsDataAccess
 */
@Stateless
public class ReviewsDataAccess implements ReviewsDataAccessLocal {

	@PersistenceContext(unitName="ReviewSystem")
	private EntityManager entityManager;
	
    public ReviewsDataAccess() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addReview(String userName, String productName, String comment,
			int rating) {
		Reviews review = new Reviews(userName,productName,comment,rating);
		entityManager.persist(review);
		
	}

	@Override
	public List<Reviews> listReviews() {
		
		Query query = entityManager.createQuery("select p from Reviews p");
		
		List<Reviews> items = query.getResultList();
		
		return items;
	}
    

}
