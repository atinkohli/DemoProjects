package com.kohlisoft.stockmanagement.ejb.main;

import java.util.List;

import javax.ejb.Local;

import com.kohlisoft.stockmanagement.jpa.domain.MainStock;

@Local
public interface StockManagementServiceLocal {

	public void addStock(final String itemName, final int stockCount);
	
	public List<MainStock> getCompleteStockList();
	
	public void moveStock(final String itemName, final int quantity, final String moveTo);
}
