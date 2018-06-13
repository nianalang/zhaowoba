package com.zhaowoba.dto;

import java.io.Serializable;

import com.zhaowoba.enums.LoginStateEnum;

/**
 * 用户向controller返回的结果
 * @author 郎媛勤
 *
 */
@SuppressWarnings("serial")
public class DataExcution implements Serializable{
	
	private int state;//状态

    private String stateInfo;//信息
    
	public DataExcution(LoginStateEnum loginStateEnum) {
		this.state = loginStateEnum.getState();
		this.stateInfo = loginStateEnum.getStateInfo();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
}
