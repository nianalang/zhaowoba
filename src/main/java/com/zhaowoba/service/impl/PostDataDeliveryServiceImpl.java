package com.zhaowoba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaowoba.dao.PostDataDeliveryDao;
import com.zhaowoba.dto.DataExcution;
import com.zhaowoba.dto.DataReturnResult;
import com.zhaowoba.entity.PostDataDelivery;
import com.zhaowoba.enums.LoginStateEnum;
import com.zhaowoba.service.PostDataDeliveryService;
/**
 * 发布数据的业务逻辑层
 * @author depc
 *
 */
@Service("postDataDeliveryService")
public class PostDataDeliveryServiceImpl implements PostDataDeliveryService {
	
	@Autowired
	private PostDataDeliveryDao postDataDeliveryDao;

	/**
	 * 用户发布信息
	 * @param postDataDelivery 信息实例对象
	 * @return 返回执行的结果
	 */
	public DataReturnResult<DataExcution> postDeliveryMessage(PostDataDelivery postDataDelivery) {
		try {
			int line=postDataDeliveryDao.postDeliveryMessage(postDataDelivery);
			if(line>0){
				//发布成功
				return new DataReturnResult<DataExcution>(true, new DataExcution(LoginStateEnum.SENDSUCCESS));
			}else{
				//发布失败
				return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.SENDFALL));
			}
		} catch (Exception e) {	
			e.printStackTrace();
			//系统内部错误
			return new DataReturnResult<DataExcution>(false, new DataExcution(LoginStateEnum.INNER_ERROR));
		}
	}
	
	/**
	 * 查询自己的发布或过的快递信息
	 * @param post_data_users_phone 用户的电话号
	 * @return 返回执行的结果
	 */
	public DataReturnResult<PostDataDelivery> queryDataMessage(String post_data_users_phone) {
	
		try {
			PostDataDelivery postDataDelivery = postDataDeliveryDao.queryDataMessage(post_data_users_phone);
			if (postDataDelivery != null) {
				// 成功
				return new DataReturnResult<PostDataDelivery>(true, postDataDelivery);
			} else {// 失败
				return new DataReturnResult<PostDataDelivery>(false, LoginStateEnum.INNER_ERROR.getStateInfo());
			}
		} catch (Exception e) {
			e.printStackTrace();
			//new Runtime
			// 系统内部错误
			return new DataReturnResult<PostDataDelivery>(false, LoginStateEnum.INNER_ERROR.getStateInfo());
		}
	}
	
	/**
	 * 查询所有的数据
	 */
	public DataReturnResult<List<PostDataDelivery>> queryAllDataMessage() {
		try {
			List<PostDataDelivery> postDataDelivery = postDataDeliveryDao.queryAllDataMessage();
			if (postDataDelivery != null) {
				// 成功
				return new DataReturnResult<List<PostDataDelivery>>(true, postDataDelivery);
			} else {// 失败
				return new DataReturnResult<List<PostDataDelivery>>(false, LoginStateEnum.INNER_ERROR.getStateInfo());
			}
		} catch (Exception e) {
			e.printStackTrace();
			//new Runtime
			// 系统内部错误
			return new DataReturnResult<List<PostDataDelivery>>(false, LoginStateEnum.INNER_ERROR.getStateInfo());
		}
	}

}
