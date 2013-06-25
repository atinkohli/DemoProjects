package OnlineRetail;

import java.util.Collection;

public class Driver {

	public static void main(String[] args) {
		
		Service serv = new Service();
		
//		System.out.println("Count = " + serv.getProductCount());
//		
//		Product result = serv.getProductByPK(3);
//		System.out.println("Product with PK 3 ---> " + "Name = " + result.getProductName() );
//		
//		System.out.println("Count by fetching all of them  = " + serv.getAllProducts().size());
		Collection<Product> pp = serv.getAllProducts();
		for(Product p : pp) {
			System.out.println("Product Name - " + p.getProductName());
			for(Review r : p.getReviews()){
				System.out.println("Reviews ==  ID - " + r.getId() + " Message - " + r.getReviewMessage() );
			}
		}
		
//		Collection<Product> pp = serv.getProductsInPriceRange(50, 150);
//		
//		
//		for(Product p : pp){
//			System.out.println("Name of product in Range - " + p.getProductName());
//		}
	}
	
}
