package com.test.dao;

import java.util.List;
import java.util.Map;

public interface MtUserDao {
	/**
	 * 通过登录名获取用户
	 * @param loginName
	 * @return
	 */
	public  MtUserDao getOneByName(String loginName);
	/**
	 * 通过id获取用户
	 * @param userId
	 * @return
	 */
	public  MtUserDao getOneById(int userId);
	/**
	 * 添加用户
	 * @param bean
	 */
	public  void insetOne(MtUserDao bean);
	/**
	 * 修改用户
	 * @param bean
	 */
	public  void updateOne(MtUserDao bean);
	/**
	 * 获取用户集合
	 * @param map
	 * @return
	 */
	public  List<MtUserDao> getUser(Map map);
}
