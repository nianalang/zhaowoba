package com.zhaowoba.entity;

import java.io.Serializable;

/**
 * 代取快递用户数据发布表
 * 
 * @author depc
 *
 */
public class PostDataDelivery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 用户发布数据表id
	 */
	private Integer post_data_delivery_id;
	/*
	 * 发布人电话
	 */
	private String post_data_person_phone;
	
	/*
	 * 收件人电话
	 */
	private String post_data_users_phone;
	
	/*
	 * 收件人姓名
	 */
	private String post_data_delivery_name;
	/*
	 * 快递信息
	 */
	private String post_data_delivery_message;
	/*
	 * 送达的地点
	 */
	private String post_data_delivery_address;
	
	/*
	 *代取价格
	 */
	private String post_data_replace_price;

	public Integer getPost_data_delivery_id() {
		return post_data_delivery_id;
	}

	public void setPost_data_delivery_id(Integer post_data_delivery_id) {
		this.post_data_delivery_id = post_data_delivery_id;
	}

	public String getPost_data_person_phone() {
		return post_data_person_phone;
	}

	public void setPost_data_person_phone(String post_data_person_phone) {
		this.post_data_person_phone = post_data_person_phone;
	}

	public String getPost_data_users_phone() {
		return post_data_users_phone;
	}

	public void setPost_data_users_phone(String post_data_users_phone) {
		this.post_data_users_phone = post_data_users_phone;
	}

	public String getPost_data_delivery_name() {
		return post_data_delivery_name;
	}

	public void setPost_data_delivery_name(String post_data_delivery_name) {
		this.post_data_delivery_name = post_data_delivery_name;
	}

	public String getPost_data_delivery_message() {
		return post_data_delivery_message;
	}

	public void setPost_data_delivery_message(String post_data_delivery_message) {
		this.post_data_delivery_message = post_data_delivery_message;
	}

	public String getPost_data_delivery_address() {
		return post_data_delivery_address;
	}

	public void setPost_data_delivery_address(String post_data_delivery_address) {
		this.post_data_delivery_address = post_data_delivery_address;
	}

	public String getPost_data_replace_price() {
		return post_data_replace_price;
	}

	public void setPost_data_replace_price(String post_data_replace_price) {
		this.post_data_replace_price = post_data_replace_price;
	}	
}
