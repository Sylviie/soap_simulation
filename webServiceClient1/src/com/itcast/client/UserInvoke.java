package com.itcast.client;

import com.baidu.google.User;
import com.baidu.google.UserDao;
import com.baidu.google.UserDaoService;

/**
 * 调用带有参数或者含有对象的webservice
 */
public class UserInvoke {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoService().getUserDaoPort();
		User user = userDao.findUserByid(1);
		System.out.println(user.getName());
	}
}
