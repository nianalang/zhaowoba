package com.zhaowoba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaowoba.dao.UsersDao;
import com.zhaowoba.dto.DataReturnResult;
import com.zhaowoba.dto.DataExcution;
import com.zhaowoba.entity.SimplifyUsers;
import com.zhaowoba.entity.Users;
import com.zhaowoba.enums.LoginStateEnum;
import com.zhaowoba.service.UsersService;

/**
 * 用户的业务逻辑层
 * 
 * @author depc
 *
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao usersDao;

	/**
	 * 添加一名用户
	 * 
	 * @param users
	 *            用户的实例
	 * @return 返回执行的结果
	 */
	public DataReturnResult<DataExcution> insertUsers(Users users) {
		try {
			users.setUsers_credit(80);// 信任值初始设为80分
			int line = 0;
			line = usersDao.insertUsers(users);
			if (line > 0) {
				// 添加成功
				return new DataReturnResult<DataExcution>(true, new DataExcution(LoginStateEnum.INSERTSUCCESS));
			} else {
				// 添加失败
				return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.INSERTFAIL));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// 系统内部错误
			return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.INNER_ERROR));
		}
	}

	/**
	 * 根据用户名查询密码
	 * 
	 * @param users_name
	 *            用户名
	 * @return 密码
	 */
	public DataReturnResult<DataExcution> queryPasswordByUserName(SimplifyUsers simplifyUserss) {
		try {
			if (simplifyUserss.getUsers_phone() != null) {
				// 根据用户名查询密码
				String sql_password = usersDao.queryPasswordByUserName(simplifyUserss.getUsers_phone());

				if (sql_password != null && simplifyUserss.getUsers_password().equals(sql_password)) {
					// 如果查询到的密码和用户输入的密码一致
					return new DataReturnResult<DataExcution>(true, new DataExcution(LoginStateEnum.SUCCESS));
				} else {// 密码为空或不存在
					return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.PASSWORDERROR));
				}
			} else {// 用户输入的用户名为空
				return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.PHONEERROR));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// 系统内部错误
			return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.INNER_ERROR));
		}
	}

	/**
	 * 重置密码
	 * 
	 * @param users_password
	 *            用户的新密码
	 * @return 返回执行的结果
	 */
	public DataReturnResult<DataExcution> resetPassword(SimplifyUsers simplifyUsers) {

		try {
			// 根据用户名查询密码
			String sql_password = usersDao.queryPasswordByUserName(simplifyUsers.getUsers_phone());
			if (sql_password != null) {
				// 修改数据
				int line = usersDao.resetPassword(simplifyUsers);
				if (line > 0) {// 说明重置成功
					return new DataReturnResult<DataExcution>(true, new DataExcution(LoginStateEnum.RESETSUCCESS));
				} else {// 重置失败
					return new DataReturnResult<DataExcution>(true, new DataExcution(LoginStateEnum.RESETFAIL));
				}
			} else {// 该用户名不存在
				return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.PHONEERROR));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// 系统内部错误
			return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.INNER_ERROR));
		}

	}
}
