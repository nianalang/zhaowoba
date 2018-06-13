package com.zhaowoba.service;

import com.zhaowoba.dto.DataReturnResult;
import com.zhaowoba.dto.DataExcution;
import com.zhaowoba.entity.SimplifyUsers;
import com.zhaowoba.entity.Users;

/**
 * 业务逻辑层接口
 * @author depc
 *
 */
public interface UsersService {

	/**
	 * 添加一名用户
	 * @param users 用户的实例
	 * @return 返回执行的结果
	 */
	DataReturnResult<DataExcution> insertUsers(Users users);
	
	/**
	 * 根据用户名查询密码
	 * @param users_name 用户名
	 * @return 密码
	 */
	DataReturnResult<DataExcution> queryPasswordByUserName(SimplifyUsers simplifyUsers);
	
	/**
	 * 重置密码
	 * @param users_password 用户的新密码
	 * @return 返回执行的结果
	 */
	DataReturnResult<DataExcution> resetPassword(SimplifyUsers simplifyUsers);
}
