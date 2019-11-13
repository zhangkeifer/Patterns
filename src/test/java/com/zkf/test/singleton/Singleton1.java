package com.zkf.test.singleton;
/**
 * 饿汉模式
 * @author zhangkaifu
 *
 */
public class Singleton1 {
	
	private static Singleton1 singleton1 = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getSingletonSinstance(){
		return singleton1;
	}
}
