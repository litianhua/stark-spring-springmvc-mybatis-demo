package com.stark.app.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stark.app.model.User;
import com.stark.app.service.IUserService;

/**
 * User Controller
 * @author stark
 */
@Controller
@RequestMapping("/user/")
public class UserController {

	@Autowired
	private IUserService userService;
	
	/**
	 * 新增用户，并返回新增之后的用户信息
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/addUser.do")
	public String addUser(HttpServletRequest request, HttpServletResponse response,
			Model model) throws Exception{
		String name = request.getParameter("name");
		String pwd =request.getParameter("pwd");
		User user = new User();
		user.setId(UUID.randomUUID().toString());//使用UUID
		user.setName(name);
		user.setPassword(pwd);
		this.userService.saveVo(user);
		model.addAttribute("user", user);
		return "/WEB-INF/jsp/result";
	}
	
	/**
	 * 根据id获取用户信息
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value="/getUser.do")
	public Object loadUser(HttpServletRequest request) throws Exception{
		String id = request.getParameter("id");
		User user = this.userService.findById(id);
		return user;
	}
	
	/**
	 * 获取所有的用户列表
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value="/getUserlist.do")
	public Object userList(HttpServletRequest request) throws Exception{
		//查询数据
		List<User> userList = this.userService.findAll();
		return userList;
	}
	
}
