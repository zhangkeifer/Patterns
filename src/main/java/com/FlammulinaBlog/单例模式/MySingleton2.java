package com.FlammulinaBlog.单例模式;
/**
 * 饿汉模式
 * @author zhangkaifu
 * 在类创建的同时就已经创建好一个静态的对象共系统使用
 * 天生是线程安全的
 *
 */
public class MySingleton2 {

	private static final MySingleton2 mySingleton2 = new MySingleton2();
	
	private MySingleton2(){}
	
	public static MySingleton2 getInstance(){
		return mySingleton2;
	}
}
