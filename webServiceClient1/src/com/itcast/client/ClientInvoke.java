package com.itcast.client;


import com.baidu.google.UserDao;
import com.baidu.google.UserDaoService;

/**
 * 客户端调用发布的webservice
 * 在java jdk里面也提供了调用web service的一种解决方案
 *
 * 使用java jdk自带的命令(知道命令叫什么)，作用调用webservice
 * wsimport
 * 作用: 可以根据服务说明书的地址来生成本地的java代码
 */
public class ClientInvoke {
	public static void main(String[] args) {
		//先找接口
		UserDao userDao = null;

		//要找继承了Service的类，通过这个类我可以得到userDao的实例
		UserDaoService daoService = new UserDaoService();

		userDao = daoService.getUserDaoPort();
		userDao.add();
	}
}
