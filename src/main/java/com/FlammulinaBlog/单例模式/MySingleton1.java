package com.FlammulinaBlog.单例模式;
/**
 * 懒汉式
 * @author zhangkaifu
 *
 */
/**
 * 存在线程安全问题
 * @author zhangkaifu
 *
 */
public class MySingleton1 {
	
	private static MySingleton1 singleton = null;
	
	private MySingleton1() {
	}
	
	public static MySingleton1 getSingleton(){
		if(singleton == null){
			singleton = new MySingleton1();
		}
		return singleton;
	}
}



