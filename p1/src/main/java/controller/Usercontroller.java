package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import model.User;
import service.User_Service;
import serviceImpl.User_Service_Impl;

@Controller
@RequestMapping("User")
public class Usercontroller {
	@Autowired
	User_Service service;
	
	@RequestMapping("login")
	public String login(User u, String code,ModelMap m,HttpSession s) {
//		String num=s.getAttribute("number").toString();
//		if(!num.equalsIgnoreCase(code)) {
//			return "redirect:/login.html";
//		}
		try {
//	会话时间管理SecurityUtils.getSubject().getSession().setTimeout(20);
		SecurityUtils.getSubject().login(new UsernamePasswordToken(u.getName(),u.getPass()));
		}catch(AccountException e) {
			return "redirect:/login.html";
		}
		return "redirect:/index.jsp";
		
		
//		User user=service.login(u);
//		if(user!=null) {
//			s.setMaxInactiveInterval(200);
//			s.setAttribute("user",user);
//			return "index";
//		}else {
//			return "redirect:/login.html";
//		}
	}
	
	
	
	@RequestMapping("outlogin")
	public String login(HttpSession s) {
		SecurityUtils.getSubject().logout();
		return "redirect:/login.html";
	}
	
	
	
	@RequestMapping("index")
	public String  index(ModelMap m) {
		m.put("list", service.select());
		return "User/index";
	}
	
	@RequestMapping("add")
	public String  add(ModelMap m) {
		return "User/edit";
	}
	
	@RequestMapping("edit")
	public String  edit(int id,ModelMap m) {
		m.put("info", service.selectById(id));
		return add(m);
	}
	
	@RequestMapping("insert")
	public String  insert(User b,ModelMap m) {
		service.insert(b);
		return index(m);
	}
	@RequestMapping("update")
	public String  update(User b,ModelMap m) {
		service.update(b);
		return index(m);
	}
	@RequestMapping("delete")
	public String  delete(int id,ModelMap m) {
		service.delete(id);
		return index(m);
	}
}
