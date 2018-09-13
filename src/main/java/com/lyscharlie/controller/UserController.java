package com.lyscharlie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lyscharlie.biz.core.user.domain.UserDO;
import com.lyscharlie.biz.core.user.service.UserService;
import com.lyscharlie.common.dto.ResultDTO;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("user")
	public UserDO userInfo() {
		ResultDTO<UserDO> r = this.userService.queryUserByName("lyscharlie");
		return r.getModule();
	}
}
