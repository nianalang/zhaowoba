package com.zhaowoba.entity;

import java.io.Serializable;

/**
 * 用户表
 * @author 郎媛勤
 *
 */
@SuppressWarnings("serial")
public class Users implements  Serializable{

	/*
	 * 用户id
	 */
	private Integer users_id; 
	/*
	 * 用户电话号码
	 */
	private String users_phone;
	/*
	 * 用户密码
	 */
	private String users_password;
	
	/*
	 * 用户性别 
	 */
	private String users_sex;
	/*
	 * 用户信任值
	 */
	private Integer users_credit;
	public Integer getUsers_id() {
		return users_id;
	}
	public void setUsers_id(Integer users_id) {
		this.users_id = users_id;
	}
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
	public Integer getUsers_credit() {
		return users_credit;
	}
	public void setUsers_credit(Integer users_credit) {
		this.users_credit = users_credit;
	}
	public String getUsers_sex() {
		return users_sex;
	}
	public void setUsers_sex(String users_sex) {
		this.users_sex = users_sex;
	}
	@Override
	public String toString() {
		return "Users [users_id=" + users_id + ", users_phone=" + users_phone + ", users_password=" + users_password
				+ ", users_sex=" + users_sex + ", users_credit=" + users_credit + "]";
	}
	
}
