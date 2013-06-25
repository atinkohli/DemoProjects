package com.kohlisoft.stockmanagement.jpa.service;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import com.kohlisoft.stockmanagement.jpa.domain.MainStock;

@Local
public interface StockManagementBeanJpa {
	
	public void addItemToStock(final String itemName, final int itemCount);
	
	public void moveStock(final String itemName, final int quantity, final String moveTo);
	
	public List<MainStock> getCompleteStockList();
}
