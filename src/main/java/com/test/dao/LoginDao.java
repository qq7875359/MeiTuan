package com.test.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.test.bean.UserBean;

@Repository
public interface LoginDao  {
	public List<UserBean> login(Map map);
	public List<UserBean> selectAll();
	
}
