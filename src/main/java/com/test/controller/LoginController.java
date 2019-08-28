package com.test.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.bean.UserBean;

@Controller
@RequestMapping()
public class LoginController {

	protected static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@RequestMapping("/index")
	public String index() {
		return "login";
	}
	@RequestMapping(value="/login") 
	public String login(Model model,String loginName,String loginPwd) {
		LOGGER.info("name===="+loginName);
		LOGGER.info("loginPwd===="+loginPwd);
		System.out.println(loginName);
        Subject subject = SecurityUtils.getSubject();  
        UsernamePasswordToken token = new UsernamePasswordToken(loginName, loginPwd);
        try {  
        	System.out.println("121212");
            subject.login(token);
            Session session=subject.getSession();
            session.setAttribute("subject", subject);
            model.addAttribute("subject", "登陆成功");
            return "index";
            
        } catch (AuthenticationException e) {  
        	System.out.println("验证失败");
        	e.printStackTrace();
            model.addAttribute("error", "验证失败");  
            return "login"; 
        }  
	}
}
