package com.FlammulinaBlog.单例模式01;
/**
 * 最好的写法
 * @author zhangkaifu
 *
 */
public class A01Singleton {

	//构造器私有化
	private A01Singleton(){
	}
	
	//使用内部类维护单例
	private static class SingletonFactory{
		private static A01Singleton singleton = new A01Singleton();
		
	}
	
	//获取实例
	public static A01Singleton getInstance(){
		return SingletonFactory.singleton;
	}
	
	//如果该对象被用于序列化 ，可以保证对象在序列化前后保持一致
	public Object readResolve(){
		return getInstance();
	}
	
	
}
