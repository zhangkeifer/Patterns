package com.FlammulinaBlog.单例模式01;
/**
 * 餓漢式
 * @author zhangkaifu
 * 天生线程安全
 */
public class A03Singleton {
	
	private static final A03Singleton instance = new A03Singleton();
	
	private A03Singleton() {
	}
	
	public static A03Singleton getInstance(){
		return instance;
	}
}
