package com.test.bean;

import java.util.Date;
import java.util.List;

public class MtOrderBean {
	private int orderId	;//	订单id
	private String orderRemark;		//订单备注
	private int areaId	;//	地址id
	private String city;//城市
	private String area;//区县
	private String remark;//地址备注
	private int storeId;//		商家id
	private String sorteName;//商家名称
	private String payMoney;//		支付金额
	private String spayMoney;//		应付金额
	private int userId	;//	用户id
	private String userName;//用户名称
	private Date orderTime;//		下单时间
	private List<MtShopCarBean> goodsList;//商品
	private int paytype;//订单状态
	@Override
	public String toString() {
		return "MtOrderBean [orderId=" + orderId + ", orderRemark=" + orderRemark + ", areaId=" + areaId + ", city="
				+ city + ", area=" + area + ", remark=" + remark + ", storeId=" + storeId + ", sorteName=" + sorteName
				+ ", payMoney=" + payMoney + ", spayMoney=" + spayMoney + ", userId=" + userId + ", userName="
				+ userName + ", orderTime=" + orderTime + ", goodsList=" + goodsList + "]";
	}
	public MtOrderBean() {
		super();
	}
	public MtOrderBean(int orderId, String orderRemark, int areaId, String city, String area, String remark,
			int storeId, String sorteName, String payMoney, String spayMoney, int userId, String userName,
			Date orderTime, List<MtShopCarBean> goodsList) {
		super();
		this.orderId = orderId;
		this.orderRemark = orderRemark;
		this.areaId = areaId;
		this.city = city;
		this.area = area;
		this.remark = remark;
		this.storeId = storeId;
		this.sorteName = sorteName;
		this.payMoney = payMoney;
		this.spayMoney = spayMoney;
		this.userId = userId;
		this.userName = userName;
		this.orderTime = orderTime;
		this.goodsList = goodsList;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderRemark() {
		return orderRemark;
	}
	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getSorteName() {
		return sorteName;
	}
	public void setSorteName(String sorteName) {
		this.sorteName = sorteName;
	}
	public String getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}
	public String getSpayMoney() {
		return spayMoney;
	}
	public void setSpayMoney(String spayMoney) {
		this.spayMoney = spayMoney;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public List<MtShopCarBean> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<MtShopCarBean> goodsList) {
		this.goodsList = goodsList;
	}
	

}
