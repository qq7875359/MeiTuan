package com.test.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.bean.MtUserBean;
import com.test.bean.ResponseBean;

@Controller
@RequestMapping("/user")
public class MtUserController {

	protected static final Logger LOGGER = Logger.getLogger(MtUserController.class);

	@RequestMapping("/regist")
	public ResponseBean regist(MtUserBean bean ) {
		
		ResponseBean response = new ResponseBean();
		
		response.setCode("0");
		response.setData(response);
		response.setFallMsg("失败");
		return response;
		
	}
}
