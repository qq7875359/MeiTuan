package com.test.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.UserBean;
import com.test.dao.LoginDao;
import com.test.service.LoginService;

@Service
public class LoginServiceImpl   implements LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	public List<UserBean> login(String loginName , String loginPwd){
		Map map = new HashMap(); 
		map.put("loginName", loginName);
		map.put("loginPwd", loginPwd);
		List<UserBean> list = loginDao.login(map);
		return list;
	}

	@Override
	public List<UserBean> selectAll() {
		// TODO Auto-generated method stub
		List<UserBean> ll = loginDao.selectAll();
		return ll;
	}
}
