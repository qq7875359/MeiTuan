package com.test.bean;

public class MtAdressBean {
	private int addressId	;//	地址id
	private int userId	;	//用户id
	private String city	;	//所在城市
	private String area	;//	所在区县
	private String userName	;//	用户姓名
	private String tel	;//	联系方式
	private String remark	;//	备注
	private String defaultType	;//	是否 默认
	
	
	
	public MtAdressBean() {
		super();
	}
	
	public MtAdressBean(int addressId, int userId, String city, String area, String userName, String tel, String remark,
			String defaultType) {
		super();
		this.addressId = addressId;
		this.userId = userId;
		this.city = city;
		this.area = area;
		this.userName = userName;
		this.tel = tel;
		this.remark = remark;
		this.defaultType = defaultType;
	}

	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDefaultType() {
		return defaultType;
	}
	public void setDefaultType(String defaultType) {
		this.defaultType = defaultType;
	}

	@Override
	public String toString() {
		return "MtAdressBean [addressId=" + addressId + ", userId=" + userId + ", city=" + city + ", area=" + area
				+ ", userName=" + userName + ", tel=" + tel + ", remark=" + remark + ", defaultType=" + defaultType
				+ "]";
	}

	
}
