package com.zkf.test.proxy3;

import com.zkf.test.proxy1.IUserDao;
import com.zkf.test.proxy1.UserDao;

public class App {
	
	public static void main(String[] args) {
		
		IUserDao target = new UserDao();
		
		IUserDao proxy = (IUserDao)new ProxyFactory(target).getProxyInstance();
		System.out.println(proxy.getClass());
		proxy.save();
	}

}
