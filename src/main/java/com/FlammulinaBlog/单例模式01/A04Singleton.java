package com.FlammulinaBlog.单例模式01;
/**
 * 懒汉式  解决线程安全的方案
 * 加同步锁
 * @author zhangkaifu
 * 缺点：严重影响性能
 */
public class A04Singleton {
	
	private static A04Singleton instance = null;
	
	private A04Singleton() {
	}
	
	private synchronized A04Singleton getInstance(){
		if(instance == null){
			return instance = new A04Singleton();
		}
		return instance;
	}
	
}
