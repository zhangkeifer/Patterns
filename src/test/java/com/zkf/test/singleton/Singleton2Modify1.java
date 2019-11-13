package com.zkf.test.singleton;
/**
 * 加同步锁
 * @author zhangkaifu
 *
 */
public class Singleton2Modify1 {
	
	private static Singleton2Modify1 singleton2Modify = null;
	
	private Singleton2Modify1() {
	}
	
	public static synchronized Singleton2Modify1 getSingleton(){
		if(singleton2Modify == null){
			singleton2Modify = new Singleton2Modify1();
		}
		return singleton2Modify;
	}
	
}
