package com.dragon.lx.controller.sys;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dragon.lx.proj.User;
import com.dragon.lx.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request,Model model) {
		String userId = request.getParameter("id");
		User user = userService.getUserById(userId);
		model.addAttribute("user", user);
		return "management/sys/user/showUser";
	}
}
