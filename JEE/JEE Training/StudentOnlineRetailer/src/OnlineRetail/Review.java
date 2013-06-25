package OnlineRetail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reviews",schema="AKA")
public class Review {

	private int id;
	
	private String reviewMessage;

	public Review() {
		// TODO Auto-generated constructor stub
	}
	
	public Review(String message){
		this.reviewMessage = message;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getReviewMessage() {
		return reviewMessage;
	}

	public void setReviewMessage(String reviewMessage) {
		this.reviewMessage = reviewMessage;
	}
	
}
