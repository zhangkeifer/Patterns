package com.FlammulinaBlog.单例模式01;
/**
 * 双层检查锁定   + volatile
 * @author zhangkaifu
 * 有风险
 */
public class A05Singleton {

	private static volatile A05Singleton instance = null;
	
	private A05Singleton() {
	}
	
	public static A05Singleton getInstance(){
		if(instance == null){
			synchronized (A05Singleton.class) {
				if(instance == null){
					instance = new A05Singleton();
				}
			}
		}
		return instance;
	}
	
}
