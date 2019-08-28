package com.test.bean;

public class MtUserBean {
	/**
	 * 用户编号
	 */
	private int userId;	
	/**
	 * 用户名
	 */
	private String  userName;	
	/**
	 * 电话号
	 */
	private String  tel	;
	/**
	 * 城市
	 */
	private String  city	;
	/**
	 * 登录名
	 */
	private String  loginName	;
	/**
	 * 登录密码
	 */
	private String  loginPwd	;
	/**
	 * 支付密码
	 */
	private String  payPwd	;
	/**
	 * 余额
	 */
	private String  balance	;
	
	public MtUserBean() {
		super();
	}

	public MtUserBean(int userId, String userName, String tel, String city, String loginName, String loginPwd,
			String payPwd, String balance) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.tel = tel;
		this.city = city;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.payPwd = payPwd;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "MtUserBean [userId=" + userId + ", userName=" + userName + ", tel=" + tel + ", city=" + city
				+ ", loginName=" + loginName + ", loginPwd=" + loginPwd + ", payPwd=" + payPwd + ", balance=" + balance
				+ "]";
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	

}
