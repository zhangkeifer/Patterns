package com.zkf.test.singleton;
/**
 * 懒汉式
 * @author zhangkaifu
 *
 */
public class Singleton2 {
	
	private static Singleton2 singleton2 = null;
	
	private Singleton2() {}
	
	public static Singleton2 getSingletonInstance(){
		if(singleton2 == null){
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
