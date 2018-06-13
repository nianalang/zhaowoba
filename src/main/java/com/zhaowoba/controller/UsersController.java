package com.zhaowoba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhaowoba.dto.DataReturnResult;
import com.zhaowoba.dto.DataExcution;
import com.zhaowoba.entity.SimplifyUsers;
import com.zhaowoba.entity.Users;
import com.zhaowoba.service.UsersService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 用户的控制层
 * 
 * @author 郎媛勤
 *
 */
//@Api表示可执行测试的开放Api；value：表示请求地址，与@RequestMapping映射请求地址一致；
// Description表示对该Api进行描述
@Api(value="/用户中心", tags = "UsersController接口")
@Controller
@RequestMapping(value = "/user", produces = { "application/json;charset=utf-8" })

public class UsersController {

	@Autowired
	private UsersService usersService;

	// 添加一名用户
	@RequestMapping(value = "/insertUsers", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "新增用户", httpMethod = "POST", value = "添加一个用户")
	@ApiResponses(value = { @ApiResponse(code = 405, message = "输入格式不正确") })
	DataReturnResult<DataExcution> insertUsers(
			@ApiParam(required = true, value = "一组数据")Users users) {
		return usersService.insertUsers(users);
	}

	// 根据用户名查询密码
	@RequestMapping(value = "/queryUser", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "用户登陆", httpMethod = "POST", value = "查询一个用户")
	@ApiResponses(value = { @ApiResponse(code = 405, message = "invalid input") })
	DataReturnResult<DataExcution> queryPasswordByUserName(
			@ApiParam(required = true, value = "用户信息")SimplifyUsers simplifyUsers) {
		return usersService.queryPasswordByUserName(simplifyUsers);
	}

	// 重置密码
	@RequestMapping(value = "/resetPassword", method = RequestMethod.GET)
	@ApiOperation(notes = "重置用户密码", httpMethod = "GET", value = "重置用户密码")
	@ResponseBody
	DataReturnResult<DataExcution> resetPassword(SimplifyUsers simplifyUsers) {
		return usersService.resetPassword(simplifyUsers);
	}
}
