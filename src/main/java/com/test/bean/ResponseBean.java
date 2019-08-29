package com.test.bean;

public class ResponseBean {
	private String code;//是否成功
	private String fallMsg;//错误原因
	private Object data;//返回数据
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFallMsg() {
		return fallMsg;
	}
	public void setFallMsg(String fallMsg) {
		this.fallMsg = fallMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
