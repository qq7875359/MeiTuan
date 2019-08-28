package com.test.bean;

public class MtGoodsBean {
	private int mt_goods	;//	商品表	
	private int storeId		;//商家id	
	private String stroeName;//商家名称
	private int goodsId		;//商品id	
	private String goodsName	;//	商品名称	
	private String goodsDetails	;//	商品描述	
	private String price		;//商品单价	
	private int discountType	;//	是否优惠	
	private String goodsType	;//	商品类型	
	private String goodsPicture	;//	商品图片	
	public int getMt_goods() {
		return mt_goods;
	}
	public void setMt_goods(int mt_goods) {
		this.mt_goods = mt_goods;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStroeName() {
		return stroeName;
	}
	public void setStroeName(String stroeName) {
		this.stroeName = stroeName;
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
	public String getGoodsDetails() {
		return goodsDetails;
	}
	public void setGoodsDetails(String goodsDetails) {
		this.goodsDetails = goodsDetails;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getDiscountType() {
		return discountType;
	}
	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public String getGoodsPicture() {
		return goodsPicture;
	}
	public void setGoodsPicture(String goodsPicture) {
		this.goodsPicture = goodsPicture;
	}
	@Override
	public String toString() {
		return "MtGoodsBean [mt_goods=" + mt_goods + ", storeId=" + storeId + ", stroeName=" + stroeName + ", goodsId="
				+ goodsId + ", goodsName=" + goodsName + ", goodsDetails=" + goodsDetails + ", price=" + price
				+ ", discountType=" + discountType + ", goodsType=" + goodsType + ", goodsPicture=" + goodsPicture
				+ "]";
	}
	public MtGoodsBean(int mt_goods, int storeId, String stroeName, int goodsId, String goodsName, String goodsDetails,
			String price, int discountType, String goodsType, String goodsPicture) {
		super();
		this.mt_goods = mt_goods;
		this.storeId = storeId;
		this.stroeName = stroeName;
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsDetails = goodsDetails;
		this.price = price;
		this.discountType = discountType;
		this.goodsType = goodsType;
		this.goodsPicture = goodsPicture;
	}
	public MtGoodsBean() {
		super();
	}

	
}
