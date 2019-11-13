package com.zkf.test.proxy1;
/**
 * 静态代理之
 * 	目标对象
 * @author zhangkaifu
 *
 */
public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("----已经保存数据----");
	}

	@Override
	public void delete(String name) {
		System.out.println("name="+name+"----已经删除数据----");		
	}

}
