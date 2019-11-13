package com.zkf.test.proxy3;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor{

	//维护目标对象
	private Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	//给目标对象创建一个代理对象
	public Object getProxyInstance(){
		//工具类
		Enhancer en = new Enhancer();
		//设置父类
		en.setSuperclass(target.getClass());
		//设置回调函数
		en.setCallback(this);
		//创建子类（代理对象）
		return en.create();
	}
	
	@Override
	public Object intercept(Object object, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("开始事务3....");
		//执行目标对象的方法
		Object returnValue = method.invoke(target, args);
		System.out.println("提交事务3...");
		return returnValue;
	}

}
