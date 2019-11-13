package com.FlammulinaBlog.单例模式01;
/**
 * 推荐写法
 * 优于前面两种，既实现了线程安全，又避免了同步带来的性能影响
 * @author zhangkaifu
 *
 */
public class A06Singleton {
	
	private static class LazyHolder{
		private static final A06Singleton instance = new A06Singleton();
	}
	
	private A06Singleton(){}
	
	public static A06Singleton getInstance(){
		return LazyHolder.instance;
	}
}
