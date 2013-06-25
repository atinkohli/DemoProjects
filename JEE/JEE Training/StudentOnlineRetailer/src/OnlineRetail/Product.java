package OnlineRetail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@NamedQueries ({
	@NamedQuery(
			name="getProductsInRange",
			query="select p from Product p where p.productCost between :min and :max")
})
@Entity
@Table(name="Product",schema="AKA")
public class Product {

	private long productID;
	
	private String productName;
	
	private String productDesc;
	
	private long productCost;

	private Set<Review> reviews = new HashSet<>();
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, String desc, long cost) {
		this.productName=name;
		this.productDesc=desc;
		this.productCost=cost;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getProductID() {
		return productID;
	}

	private void setProductID(long productID) {
		this.productID = productID;
	}

	@Column(nullable=false,length=50)
	public String getProductName() {
		return productName;
	}

	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public long getProductCost() {
		return productCost;
	}

	public void setProductCost(long productCost) {
		this.productCost = productCost;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="productID")
	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}
	
	public void addReview(Review review){
		this.reviews.add(review);
	}
	
}
