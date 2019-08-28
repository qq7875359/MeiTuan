package com.test.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.service.IService;
import com.test.bean.UserBean;


@Repository
public interface LoginService  {
	public List<UserBean> login(String loginName ,String loginPwd);
	public List<UserBean> selectAll();
}
