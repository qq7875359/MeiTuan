package com.test.bean;

public class MtShopCarBean {
	private int userId		;//用户id	
	private String userNmae;//用户名
	private int storeId		;//商家id
	private String storeName;//商家名
	private int goodsId		;//商品id
	private String goodsName;//商品名称
	private int goodsNum	;//	商品数量	
	private int carType;//购物车状态
	private String shopCarId;//购物车id
	
	@Override
	public String toString() {
		return "MtShopCarBean [userId=" + userId + ", userNmae=" + userNmae + ", storeId=" + storeId + ", storeName="
				+ storeName + ", goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsNum=" + goodsNum
				+ ", carType=" + carType + ", shopCarId=" + shopCarId + "]";
	}
	public MtShopCarBean() {
		super();
	}
	public MtShopCarBean(int userId, String userNmae, int storeId, String storeName, int goodsId, String goodsName,
			int goodsNum, int carType, String shopCarId) {
		super();
		this.userId = userId;
		this.userNmae = userNmae;
		this.storeId = storeId;
		this.storeName = storeName;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsNum = goodsNum;
		this.carType = carType;
		this.shopCarId = shopCarId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserNmae() {
		return userNmae;
	}
	public void setUserNmae(String userNmae) {
		this.userNmae = userNmae;
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
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public int getCarType() {
		return carType;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
	public String getShopCarId() {
		return shopCarId;
	}
	public void setShopCarId(String shopCarId) {
		this.shopCarId = shopCarId;
	}
	
	
}
