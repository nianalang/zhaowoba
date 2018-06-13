package com.zhaowoba.dao;

import java.util.List;

import com.zhaowoba.entity.PostDataDelivery;

/**
 * 用户发送代取快递信息表
 * @author 郎媛勤
 *
 */
public interface PostDataDeliveryDao {

	/**
	 * 用户发布信息
	 * @param postDataDelivery 信息实例对象
	 * @return 影响数据库的条数
	 * @throws Exception 异常
	 */
	int postDeliveryMessage(PostDataDelivery postDataDelivery) throws Exception;
	
	/**
	 * 查询自己的发布或过的快递信息
	 * @param post_data_users_phone  用户的电话号
	 * @return
	 */
	PostDataDelivery queryDataMessage(String post_data_users_phone)  throws Exception;
	
	/**
	 * 获取到所有的已发布过的信息
	 */
	List<PostDataDelivery> queryAllDataMessage() throws Exception;
}
