package com.zhaowoba.entity;

import java.io.Serializable;

/**
 * 用于修改密码的用户表
 * 
 * @author depc
 *
 */
@SuppressWarnings("serial")
public class SimplifyUsers implements Serializable {

	/*
	 * 用户号码
	 */
	private String users_phone;
	/*
	 * 用户密码|新密码
	 */
	private String users_password;
	
	public String getUsers_phone() {
		return users_phone;
	}

	public void setUsers_phone(String users_phone) {
		this.users_phone = users_phone;
	}

	public String getUsers_password() {
		return users_password;
	}

	public void setUsers_password(String users_password) {
		this.users_password = users_password;
	}
}
