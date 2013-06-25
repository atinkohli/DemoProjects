package OnlineRetail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Service {

	private EntityManagerFactory emFact;
	
	public Service() {
		emFact = Persistence.createEntityManagerFactory("StudentOnlineRetailer");
		updateDataBaseWithProducts();
	}
	
	private void updateDataBaseWithProducts() {
		EntityManager em = emFact.createEntityManager();
		
		Product prod1 = new Product("Item1","Desc1",10);
		Review rev1 = new Review("Review 1");
		Review rev2 = new Review("Review 2");
		Review rev3 = new Review("Review 3");
		prod1.addReview(rev1);
		prod1.addReview(rev2);
		prod1.addReview(rev3);
//		Product prod2 = new Product("Item2","Desc2",30);
//		Product prod3 = new Product("Item3","Desc3",60);
//		Product prod4 = new Product("Item4","Desc4",100);
//		Product prod5 = new Product("Item5","Desc5",150);
//		Product prod6 = new Product("Item6","Desc6",200);
		
		List<Product> pList = new ArrayList<>();
		pList.add(prod1);
//		pList.add(prod2);
//		pList.add(prod3);
//		pList.add(prod4);
//		pList.add(prod5);
//		pList.add(prod6);
		
		em.getTransaction().begin();
		
		for(Product p : pList){
			em.persist(p);
		}

		em.getTransaction().commit();
		
		em.close();
	}

	public long getProductCount(){
		EntityManager em = emFact.createEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery("select count(p) from Product p");
		long count = (long)query.getSingleResult();
		
		em.close();
		return count;
	}
	
	public Product getProductByPK(long pk){
		EntityManager em = emFact.createEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery("from Product p where p.productID = :pkey");
		query.setParameter("pkey", pk);
		
		Product p = (Product)query.getSingleResult();
		em.close();
		return p;
	}
	
	public Collection<Product> getAllProducts(){
		EntityManager em = emFact.createEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery("from Product p");
		
		
		List<Product> prList = query.getResultList();
		em.close();
		return prList;
	}
	
	public Collection<Product> getProductsInPriceRange(long min,long max){
		EntityManager em = emFact.createEntityManager();
		em.getTransaction().begin();
		
		//Query query = em.createQuery("from Product p where p.productCost between :min and :max");
		Query query = em.createNamedQuery("getProductsInRange");
		query.setParameter("min", min);
		query.setParameter("max", max);
		
		List<Product> p = query.getResultList();
		em.close();
		return p;
	}
}
