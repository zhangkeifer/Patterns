package com.FlammulinaBlog.单例模式;
/**
 * 双重检查锁定  也叫做  双重检查锁定 + volatile
 * 得到的却是未被完全初始化的实例，在使用的时候必定会有风险，这正是双重检查锁定的问题所在！
 * 有风险
 * 在JDK1.5之后，可以使用volatile变量禁止指令重排序，让DCL生效：
 * @author zhangkaifu
 *
 */
public class MySingleton1Modify2 {

//	private static MySingleton1Modify2 modify2 = null;
	private static volatile MySingleton1Modify2 modify2 = null;
	private MySingleton1Modify2(){}
	
	public static MySingleton1Modify2 getSingleton1Modify2(){
		if(modify2 == null){
			synchronized (MySingleton1Modify2.class) {
				if(modify2 == null){
					modify2 = new MySingleton1Modify2();
				}
			}
		}
		return modify2;
	}
	
}
