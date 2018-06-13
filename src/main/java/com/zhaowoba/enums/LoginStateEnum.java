package com.zhaowoba.enums;

/**
 * 执行结果
 * @author 郎媛勤
 *
 */
public enum LoginStateEnum {

	SUCCESS(1,"登录成功"),
	PHONEERROR(0,"用户名错误或不存在"),
	PASSWORDERROR(-1,"密码错误或不存在"),
	INNER_ERROR(-2, "系统异常"),
	NOT_LOGIN(-3, "未登陆"),
	
	INSERTSUCCESS (4,"添加成功"),
	INSERTFAIL(-4,"添加失败"),
	
	RESETSUCCESS(6,"重置成功"),
	RESETFAIL(-6,"重置失败"),
	
	NEWDIFFERCONFIRM(-5,"两次密码输入不相同"),
	
	SENDSUCCESS(7,"发布成功"),
	SENDFALL(-7,"发布失败");
	
	/*
	 * 状态
	 */
	private int state;

	/*
	 * 信息
	 */
    private String stateInfo;

	private LoginStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
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
