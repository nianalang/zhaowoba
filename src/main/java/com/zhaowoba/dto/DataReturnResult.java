package com.zhaowoba.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DataReturnResult<T> implements Serializable{

	private boolean success;// 成功的标志

	private T data; // 数据
	
	private String error;// 错误的原因

	public DataReturnResult(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}

	public DataReturnResult(boolean success, String error) {
		super();
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}
