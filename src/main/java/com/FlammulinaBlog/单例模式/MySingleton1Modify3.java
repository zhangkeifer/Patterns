package com.FlammulinaBlog.单例模式;
/**
 * 静态内部类  也叫做 延迟初始化占位类模式
 * 优于前面两种，既实现了线程安全，又避免了同步带来的性能影响
 * @author zhangkaifu
 *
 */
public class MySingleton1Modify3 {

	private static class LazyHolder{
		private static final MySingleton1Modify3 singleton = new MySingleton1Modify3();
	}
	
	private MySingleton1Modify3() {
	}
	
	public static MySingleton1Modify3 getSingleton(){
		return LazyHolder.singleton;
	}
}
