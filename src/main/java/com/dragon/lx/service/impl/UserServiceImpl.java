package com.dragon.lx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dragon.lx.dao.UserMapper;
import com.dragon.lx.proj.User;
import com.dragon.lx.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	public User getUserById(String userId) {
		return this.userMapper.selectByPrimaryKey(userId);
	}

}
