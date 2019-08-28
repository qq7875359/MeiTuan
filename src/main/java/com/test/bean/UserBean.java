package com.test.bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBean {
	private Integer userId;
	private String userName;
	private String loginPwd;
	private String loginName;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", loginPwd=" + loginPwd + ", loginName="
				+ loginName + "]";
	}
	
	
}
