package com.FlammulinaBlog.单例模式;
/**
 * 加同步锁
 * 严重影响性能
 * @author zhangkaifu
 *
 */
public class MySingleton1Modify1{
	
	private static MySingleton1Modify1 mySingleton1Modify1 = null;
	
	private MySingleton1Modify1() {
	}
	
	public static synchronized MySingleton1Modify1 getSingleton(){
		if(mySingleton1Modify1 == null){
			mySingleton1Modify1 = new MySingleton1Modify1();
		}
		return mySingleton1Modify1;
	}
}