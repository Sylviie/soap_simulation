package com.itcast.dao;

import com.itcast.bean.User;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * 在java里面有针对webservice的解决方案...
 */

@WebService
public class UserDao {

	public void add() {
		System.out.println("itcast");
	}


	//static 方法无法发布
	public static void update() {

	}

	//阻止这个方法对外发布
	@WebMethod(exclude = true)
	public void sayHello() {
	}

	public User findUserByid(int id) {
		//做真实的开发...会进数据库找
		User user = new User();
		user.setId(id);
		user.setName("刘洋");
		user.setMomo("988889");

		user.setPapa("papa123");
		user.setWeibo("liuyang@sina.com.cn");
		return user;
	}
}
