package com.test.bean;

import java.util.Date;
import java.util.List;

public class MtCommentBean {
	private int commentId	;//	评论编号
	private int orderId	;//	订单ID
	private List<MtGoodsBean> goodsBean;//商品列表
	private Date time;//		时间
	private String content	;//	内容
	private int userId	;//	用户
	private String commentRank		;//评价等级
	
	
	
	@Override
	public String toString() {
		return "MtCommentBean [commentId=" + commentId + ", orderId=" + orderId + ", goodsBean=" + goodsBean + ", time="
				+ time + ", content=" + content + ", userId=" + userId + ", commentRank=" + commentRank + "]";
	}
	public MtCommentBean() {
		super();
	}
	public MtCommentBean(int commentId, int orderId, List<MtGoodsBean> goodsBean, Date time, String content, int userId,
			String commentRank) {
		super();
		this.commentId = commentId;
		this.orderId = orderId;
		this.goodsBean = goodsBean;
		this.time = time;
		this.content = content;
		this.userId = userId;
		this.commentRank = commentRank;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<MtGoodsBean> getGoodsBean() {
		return goodsBean;
	}
	public void setGoodsBean(List<MtGoodsBean> goodsBean) {
		this.goodsBean = goodsBean;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCommentRank() {
		return commentRank;
	}
	public void setCommentRank(String commentRank) {
		this.commentRank = commentRank;
	}
	
	
}
