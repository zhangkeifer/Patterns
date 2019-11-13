package com.zkf.test.builder;

/**
 * ConcreteBuilder（实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例）：
 * @author zhangkaifu
 *
 */
public class ManBuilder implements PersonBuilder{
	
	Person person;
	
	public ManBuilder() {
		this.person = new Person();
	}
	
	@Override
	public void buildHead() {
		person.setHead("建造男的头部部分...");
	}

	@Override
	public void buildBody() {
		person.setBody("建造男的身体部分...");		
	}

	@Override
	public void buildFoot() {
		person.setFoot("建造男的四肢部分...");		
	}
	
	@Override
	public Person buildPerson(){
		return this.person;//返回一个person实例
	}
	
}
