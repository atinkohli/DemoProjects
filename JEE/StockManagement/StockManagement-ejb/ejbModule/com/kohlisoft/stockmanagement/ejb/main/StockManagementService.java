package com.kohlisoft.stockmanagement.ejb.main;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.kohlisoft.stockmanagement.jpa.domain.MainStock;
import com.kohlisoft.stockmanagement.jpa.service.StockManagementBeanJpa;

@Stateless
public class StockManagementService implements StockManagementServiceLocal {

	@EJB
	StockManagementBeanJpa sms;

    public StockManagementService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addStock(String itemName, int stockCount) {
		sms.addItemToStock(itemName, stockCount);
		
	}

	@Override
	public List<MainStock> getCompleteStockList() {
		return sms.getCompleteStockList();
		
	}

	@Override
	public void moveStock(String itemName, int quantity, String moveTo) {
		sms.moveStock(itemName, quantity, moveTo);
		
	}

}
