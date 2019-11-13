package com.FlammulinaBlog.单例模式01;
/**
 * 普通写法 ---懒汉式
 * @author zhangkaifu
 * 存在線程安全問題
 */
public class A02Singleton {
	
	private static A02Singleton instance = null;
	
	private A02Singleton(){}
	
	public static A02Singleton getInstance(){
		if(instance == null){
			instance = new A02Singleton();
		}
		return instance;
	}
	
}
