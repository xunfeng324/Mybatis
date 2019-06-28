package com.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jt.pojo.User;
import com.jt.service.UserService;
/**
 * 在controller层注入userService层接口,用userSericee的对象调用它相应的方法
 * 
 * @author Administrator
 *
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	//localhost:8090/findAll
	@RequestMapping("/findAll")
	@ResponseBody
	public List<User> findAll(){
		return userService.findAll();
	}
	
}
