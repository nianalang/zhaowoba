package com.zhaowoba.dao;

import com.zhaowoba.entity.SimplifyUsers;
import com.zhaowoba.entity.Users;

/**
 * 用户管理的Dao层
 * @author depc
 *
 */
public interface UsersDao {

	/**
	 * 添加一名用户
	 * @param users 用户的实例
	 * @return 返回执行的结果
	 */
	int insertUsers(Users users) throws Exception;
	
	/**
	 * 根据用户名查询密码
	 * @param users_name 用户名
	 * @return 密码
	 */
	String queryPasswordByUserName(String users_phone) throws Exception;
	
	/**
	 * 重置密码
	 * @param users_password 用户的新密码
	 * @return 返回执行的结果
	 */
	int resetPassword(SimplifyUsers simplifyUsers) throws Exception;
}
