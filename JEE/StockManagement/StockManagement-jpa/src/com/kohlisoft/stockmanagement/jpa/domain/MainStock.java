package com.kohlisoft.stockmanagement.jpa.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="MainStock",schema="StockManagement")
public class MainStock {

	private long itemCode;
	
	private String itemName;
	
	private int stockCount;
	
	private Set<LocalStock> localStock = new HashSet<>();
	
	public MainStock() {

	}

	public MainStock(final String name, final int stock){
		this.itemName = name;
		this.stockCount = stock;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getItemCode() {
		return itemCode;
	}

	private void setItemCode(long itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="itemCode")
	public Set<LocalStock> getLocalStock() {
		return localStock;
	}

	public void setLocalStock(Set<LocalStock> localStock) {
		this.localStock = localStock;
	}
   
	public void addLocalStockUpdate(LocalStock localStock) {
		this.localStock.add(localStock);
	}
}
