package com.itcast.dao;

import javax.xml.ws.Endpoint;

public class PublishService {
	public static void main(String[] args) {
		/**
		 * 通过java jdk自带的类来发布webservice
		 * 1.对外提供一个访问地址
		 * 2. 被发布的是哪一个
		 * 发布这个web service的时候，wsdl也发布出来，(标准)，用来描述我的这个服务是怎么调用
		 * 服务说明书的地址 : http://localhost:8989/userDao?wsdl
		 */
		Endpoint.publish("http://localhost:8989/userDao",new UserDao());
	}
}
