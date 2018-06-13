package com.zhaowoba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhaowoba.dto.DataExcution;
import com.zhaowoba.dto.DataReturnResult;
import com.zhaowoba.entity.PostDataDelivery;
import com.zhaowoba.service.PostDataDeliveryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 用户发布数据控制层
 * 
 * @author 郎媛勤
 *
 */

@Api(value="/数据发送中心", tags = "postDataDelivery接口")
@Controller
@RequestMapping("/postDataDelivery")
public class PostDataDeliveryController {

	@Autowired
	private PostDataDeliveryService postDataDeliveryService;
	/**
	 * 
	 * @param postDataDelivery
	 * @return
	 */
	// 用户发布信息
	@RequestMapping(value = "/postDeliveryMessage", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(notes = "用户发布信息", httpMethod = "POST", value = "用户发布一条信息")
	public DataReturnResult<DataExcution> postDeliveryMessage(@ApiParam(required = true, value = "一组数据")PostDataDelivery postDataDelivery) {
		return postDataDeliveryService.postDeliveryMessage(postDataDelivery);
	}

	// 查询自己的发布过的快递信息
	@RequestMapping(value = "/queryDataMessage/{post_data_users_phone}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(notes = "已发布过的快递信息", httpMethod = "GET", value = "查询自己的发布过的快递信息")
	public DataReturnResult<PostDataDelivery> queryDataMessage(
			@PathVariable("post_data_users_phone") String post_data_users_phone) {
		
		return postDataDeliveryService.queryDataMessage(post_data_users_phone);
	}
	
	/**
	 * 查询所有的数据
	 */
	@RequestMapping(value = "/queryAllDataMessage", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(notes = "查询所有已发布过的快递信息", httpMethod = "GET", value = "查询所有已发布过的快递信息")
	DataReturnResult<List<PostDataDelivery>> queryAllDataMessage(){
		return postDataDeliveryService.queryAllDataMessage();
	}
	
}
