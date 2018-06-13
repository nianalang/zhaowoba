package com.zhaowoba.service;

import java.util.List;

import com.zhaowoba.dto.DataExcution;
import com.zhaowoba.dto.DataReturnResult;
import com.zhaowoba.entity.PostDataDelivery;

/**
 * 用户发布信息的业务逻辑层
 * @author depc
 *
 */
public interface PostDataDeliveryService {

	/**
	 * 用户发布信息
	 * @param postDataDelivery 信息实例对象
	 * @return 返回执行的结果
	 */
	DataReturnResult<DataExcution> postDeliveryMessage(PostDataDelivery postDataDelivery) ;
	
	/**
	 * 查询自己的发布或过的快递信息
	 * @param post_data_users_phone 用户的电话号
	 * @return 返回执行的结果
	 */
	DataReturnResult<PostDataDelivery> queryDataMessage(String post_data_users_phone);
	
	
	/**
	 * 查询所有的数据
	 */
	DataReturnResult<List<PostDataDelivery>> queryAllDataMessage();
}
