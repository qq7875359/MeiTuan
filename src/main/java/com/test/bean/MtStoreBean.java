package com.test.bean;

public class MtStoreBean {
	private int storeId	;
	private String storeName;	
	private String city	;
	private String storeArea;	
	private String storeType;	
	private String fullReduce	;
	private String discount	;
	private String storePircture	;
	
	
	public MtStoreBean() {
		super();
	}
	public MtStoreBean(int storeId, String storeName, String city, String storeArea, String storeType,
			String fullReduce, String discount, String storePircture) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.city = city;
		this.storeArea = storeArea;
		this.storeType = storeType;
		this.fullReduce = fullReduce;
		this.discount = discount;
		this.storePircture = storePircture;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStoreArea() {
		return storeArea;
	}
	public void setStoreArea(String storeArea) {
		this.storeArea = storeArea;
	}
	public String getStoreType() {
		return storeType;
	}
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}
	public String getFullReduce() {
		return fullReduce;
	}
	public void setFullReduce(String fullReduce) {
		this.fullReduce = fullReduce;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getStorePircture() {
		return storePircture;
	}
	public void setStorePircture(String storePircture) {
		this.storePircture = storePircture;
	}
	@Override
	public String toString() {
		return "MtStoreBean [storeId=" + storeId + ", storeName=" + storeName + ", city=" + city + ", storeArea="
				+ storeArea + ", storeType=" + storeType + ", fullReduce=" + fullReduce + ", discount=" + discount
				+ ", storePircture=" + storePircture + "]";
	}

	
	
}
