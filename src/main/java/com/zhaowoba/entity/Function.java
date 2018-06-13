package com.zhaowoba.entity;

import java.io.Serializable;

/**
 * 功能表
 * 
 * @author 郎媛勤
 *
 */
@SuppressWarnings("serial")
public class Function implements Serializable {

	/*
	 * 功能表id
	 */
	private Integer function_id;
	/*
	 * 功能表名字
	 */
	private String function_name;

	public Integer getFunction_id() {
		return function_id;
	}

	public void setFunction_id(Integer function_id) {
		this.function_id = function_id;
	}

	public String getFunction_name() {
		return function_name;
	}

	public void setFunction_name(String function_name) {
		this.function_name = function_name;
	}

	@Override
	public String toString() {
		return "Function [function_id=" + function_id + ", function_name=" + function_name + "]";
	}

}
