package com.zkf.test.proxy2;

import junit.framework.TestCase;

import com.zkf.test.proxy1.IUserDao;
import com.zkf.test.proxy1.UserDao;
import com.zkf.test.proxy2.ProxyFactory;

public class App  extends TestCase {
		
	public static void main(String[] args) {
		IUserDao target = new UserDao();
		
		IUserDao proxy  = (IUserDao)new ProxyFactory(target).getProxyInstance();
		System.out.println(proxy.getClass());
		proxy.save();
	}
	
	public void test(){
		IUserDao target = new UserDao();
		IUserDao proxy = (IUserDao)new ProxyFactory(target).getDeleteProxyInstance();
		System.out.println(proxy.getClass());
		proxy.delete("zkf");
		
	}
}
