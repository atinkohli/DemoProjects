package com.kohlisoft.stockmanagement.jpa.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.kohlisoft.stockmanagement.jpa.domain.LocalStock;
import com.kohlisoft.stockmanagement.jpa.domain.MainStock;
import com.kohlisoft.stockmanagement.jpa.service.StockManagementBeanJpa;

@Stateless
public class StockManagementBeanJpaBean implements StockManagementBeanJpa {
	
	@PersistenceContext(unitName="StockManagement")
	private EntityManager em;
	
	@Override
	public void addItemToStock(String itemName, int itemCount) {

		MainStock item = new MainStock(itemName,itemCount);
		
		em.persist(item);
	}

	@Override
	public List<MainStock> getCompleteStockList() {
	
		Query query = em.createQuery("select p from MainStock p");
		
		List<MainStock> items = query.getResultList();
		
		return items;
	}

	@Override
	public void moveStock(String itemName, int quantity, String moveTo) {
		LocalStock lStock = new LocalStock(moveTo, quantity);
		
		Query query = em.createQuery("select m from MainStock m where m.itemName = '" + itemName +"'");
//		query.setParameter("itemN", itemName);
		boolean present=false;
		MainStock item = (MainStock)query.getSingleResult();
		for(LocalStock l : item.getLocalStock()) {
			if(l.getLocationName().equals(moveTo)) {
				l.setLocalStockCount(l.getLocalStockCount()+quantity);
				present=true;
			}
		}
		if(!present) {
			item.addLocalStockUpdate(lStock);
		}
		
		int totalC = item.getStockCount();
		item.setStockCount(totalC-quantity);
		
		em.merge(item);
		
	}
}
