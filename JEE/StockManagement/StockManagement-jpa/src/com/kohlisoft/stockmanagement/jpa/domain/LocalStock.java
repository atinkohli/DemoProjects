package com.kohlisoft.stockmanagement.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name="LocalStock",schema="StockManagement")
public class LocalStock {

	private long localId;
	
	private String locationName;
	
	private int localStockCount;
	
	public LocalStock() {

	}

	public LocalStock(final String location,final int localCount){
		this.locationName = location;
		this.localStockCount = localCount;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getLocalId() {
		return localId;
	}

	private void setLocalId(long localId) {
		this.localId = localId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public int getLocalStockCount() {
		return localStockCount;
	}

	public void setLocalStockCount(int localStockCount) {
		this.localStockCount = localStockCount;
	}
   
}
