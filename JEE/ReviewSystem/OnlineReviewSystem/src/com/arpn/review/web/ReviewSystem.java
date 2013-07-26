package com.arpn.review.web;


import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.arpn.review.ejb.ReviewServiceLocal;
import com.arpn.review.jpa.domain.Reviews;
import com.arpn.review.web.domain.ReviewView;

@ApplicationScoped
@Path("/Reviews")
public class ReviewSystem {

	@Inject
	private ReviewServiceLocal revService;
	
	@GET()
	@Produces({"application/json", "application/xml"})
	public List<ReviewView> listReviews() throws Exception{
		
		List<ReviewView> list = new ArrayList<ReviewView>();
		List<Reviews> revList = revService.listReviews();
		for(Reviews r : revList) {
//			ReviewView rv = new ReviewView();
//			rv.setReviewId(r.getReviewId());
//			rv.setUserName(r.getUserName());
//			rv.setProductName(r.getProductName());
//			rv.setRating(r.getRating());
//			rv.setComment(r.getComment());
//			list.add(rv);
			list.add(new ReviewView(r.getReviewId(), r.getUserName(), 
					r.getProductName(), r.getComment(), r.getRating()));
		}
		
		return list;


	}
	
	@POST()
	@Produces({"text/plain","application/xml","application/json"})
	@Consumes({"application/json", "application/xml"})
	public String addReview(ReviewView revObj) {
		
		return revService.addReview(revObj.getUserName(), revObj.getProductName(),
				revObj.getComment(),revObj.getRating());
	}
	
}
