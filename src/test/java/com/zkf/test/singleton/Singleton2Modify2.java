package com.zkf.test.singleton;
/**
 * 双重检查锁定 + volatile
 * @author zhangkaifu
 *
 */
public class Singleton2Modify2 {
	
//	private static Singleton2Modify2 singleton2Modify2 = null;
	private static volatile Singleton2Modify2 singleton2Modify2 = null;
	
	private Singleton2Modify2() {
	}
	
	public static Singleton2Modify2 getSingleton(){
		if(singleton2Modify2 == null){
			synchronized (Singleton2Modify2.class) {
				if(singleton2Modify2 == null){
					singleton2Modify2 = new Singleton2Modify2();
				}
			}
		}
		return singleton2Modify2;
	}
}
