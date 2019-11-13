package com.zkf.test.proxy1;
/**
 * 静态代理之
 * 	代理对象  静态代理
 * @author zhangkaifu
 * 
 *
 */
public class UserDaoProxy implements IUserDao{
	//接收保存目标对象
	private IUserDao target;
	
	public UserDaoProxy(IUserDao target) {
		this.target = target;
	}
	
	public void save(){
		System.out.println("开始事务...");
		target.save();//执行目标对象的方法
		System.out.println("提交事务...");
	}

	@Override
	public void delete(String name) {
		System.out.println(name+"开始删除事务...");
		target.save();//执行目标对象的方法
		System.out.println(name+"提交删除事务...");
	}
	
}
