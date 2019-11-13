package com.zkf.test.singleton;
/**
 * 延迟初始化 占位类模式
 * @author zhangkaifu
 *
 */
public class Singleton2Modify3 {
	
	private static class LazyHolder{
		private static final Singleton2Modify3 singleton = new Singleton2Modify3();
		
	}
	
	private Singleton2Modify3(){}
	
	public static Singleton2Modify3 getSingleton(){
		return LazyHolder.singleton;
	}
}

