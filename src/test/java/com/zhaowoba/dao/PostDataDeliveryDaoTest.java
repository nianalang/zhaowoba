package com.zhaowoba.dao;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhaowoba.entity.PostDataDelivery;
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试  
@ContextConfiguration(locations={"classpath:spring/spring-dao.xml"}) 
public class PostDataDeliveryDaoTest {

	@Resource
	private PostDataDeliveryDao postDataDeliveryDao;
	@Test
	public void testQueryAllDataMessage() {
		try {
			List<PostDataDelivery> dataDeliveries=postDataDeliveryDao.queryAllDataMessage();
			System.out.println(dataDeliveries.size()+"kkkkkkkkkkkkkkkk");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
