package com.zhaowoba.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户订单表
 * 
 * @author 郎媛勤
 *
 */
@SuppressWarnings("serial")
public class Orders implements Serializable {

	/*
	 * 订单表id
	 */
	private Integer orders_id;
	/*
	 * 发布数据的用户电话号码
	 */
	private String post_data_users_phone;
	/*
	 * 接订单的用户电话号码
	 */
	private String get_data_users_phone;
	/*
	 * 订单的状态
	 */
	private String orders_status;
	/*
	 * 订单创建的时间
	 */
	private Date orders_time;

	public Integer getOrders_id() {
		return orders_id;
	}

	public void setOrders_id(Integer orders_id) {
		this.orders_id = orders_id;
	}

	public String getPost_data_users_phone() {
		return post_data_users_phone;
	}

	public void setPost_data_users_phone(String post_data_users_phone) {
		this.post_data_users_phone = post_data_users_phone;
	}

	public String getGet_data_users_phone() {
		return get_data_users_phone;
	}

	public void setGet_data_users_phone(String get_data_users_phone) {
		this.get_data_users_phone = get_data_users_phone;
	}

	public String getOrders_status() {
		return orders_status;
	}

	public void setOrders_status(String orders_status) {
		this.orders_status = orders_status;
	}

	public Date getOrders_time() {
		return orders_time;
	}

	public void setOrders_time(Date orders_time) {
		this.orders_time = orders_time;
	}

	@Override
	public String toString() {
		return "Orders [orders_id=" + orders_id + ", post_data_users_phone=" + post_data_users_phone
				+ ", get_data_users_phone=" + get_data_users_phone + ", orders_status=" + orders_status
				+ ", orders_time=" + orders_time + "]";
	}

}
