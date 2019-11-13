package com.FlammulinaBlog.单例模式01;
/**
 * 双层检查锁定   + volatile
 * @author zhangkaifu
 * 有风险
 * 似乎看起来降低了直接synchronized修饰类的开销，但是存在了多线程不安全。
首先，当线程A第一次执行到//2的时候，线程B同时也执行//1，这个时候线程A可能会得到instance！= null的情况，然后返回该实例，但返回的是一个空的实例，
是因为真正的情况线程A还没有初始化完毕instance实例。
请参考：https://www.jianshu.com/p/17ed6a46ed85
 */
public class A05Singleton {

	private static volatile A05Singleton instance = null;
	
	private A05Singleton() {
	}
	
	public static A05Singleton getInstance(){
		if(instance == null){  //1
			synchronized (A05Singleton.class) {
				if(instance == null){
					instance = new A05Singleton();//2
				}
			}
		}
		return instance;
	}
	
}
