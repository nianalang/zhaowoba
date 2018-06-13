--创建数据表
CREATE database zhaowoba;
--使用数据库
use  zhaowoba;

drop database zhaowoba;
--创建用户数据表
CREATE table  users(
	users_id int NOT NULL  AUTO_INCREMENT COMMENT '用户id',
	users_phone varchar(20) NOT NULL COMMENT '用户电话号码',
	users_password varchar(20) NOT NULL COMMENT '用户密码',
	users_sex char(20) NOT NULL COMMENT '用户性别',
	users_credit int NOT NULL COMMENT '用户信任值' default '80',
	PRIMARY KEY (users_id)
);
insert into 
	users(users_phone,users_password,users_sex) 
	values('15140594871','123456','女');
	
--希望实现的功能表
CREATE table function(
	function_id int NOT NULL  AUTO_INCREMENT COMMENT '功能表id',
	function_name varchar(50) NOT NULL COMMENT '功能表名字',
	PRIMARY KEY (function_id)
);

--插入数据
insert into 
	 function(function_name)
values
	('取快递'),
	('取水壶'),
	('带饭'),
	('旧物置换');

drop table post_data_delivery;
--创建用户发布数据表(代取快递)
CREATE table post_data_delivery(
	post_data_delivery_id  int NOT NULL  AUTO_INCREMENT COMMENT '用户发布数据表id',
	post_data_person_phone varchar(20) NOT NULL COMMENT '发布人电话',
	post_data_users_phone varchar(20) NOT NULL COMMENT '收件人电话',
	post_data_delivery_name varchar(50) NOT NULL COMMENT '收件人姓名',
    post_data_delivery_message varchar(200) NOT NULL COMMENT '快递信息',
    post_data_delivery_address  varchar(100) NOT NULL COMMENT '送达的地点',
    post_data_replace_price varchar(10) NOT NULL COMMENT '代取价格',
    PRIMARY KEY (post_data_delivery_id)
);



--创建订单表
CREATE table orders(
	 orders_id int NOT NULL  AUTO_INCREMENT COMMENT '订单表id',
	 post_data_users_phone varchar(20) NOT NULL COMMENT '发布数据的用户电话号码',
	 get_data_users_phone varchar(20) NOT NULL COMMENT '接订单的用户电话号码',	
	 orders_status varchar(10) NOT NULL COMMENT '订单的状态',	
	 orders_time timestamp NOT NULL COMMENT '订单创建的时间', 
	 PRIMARY KEY (orders_id)
);