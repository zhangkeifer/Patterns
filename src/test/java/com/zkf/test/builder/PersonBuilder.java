package com.zkf.test.builder;
/**
 * Builder给出一个抽象接口，以规范产品对象的各个组成成分的建造。
 * 这个接口规定要实现复杂对象的那些部分的创建，并不涉及具体对象的创建。
 * @author zhangkaifu
 *
 */
public interface PersonBuilder {
	
	void buildHead();
	
	void buildBody();
	
	void buildFoot();
	
	Person buildPerson();
	
}
