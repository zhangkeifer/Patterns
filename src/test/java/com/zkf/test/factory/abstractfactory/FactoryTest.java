package com.zkf.test.factory.abstractfactory;

import junit.framework.TestCase;

public class FactoryTest extends TestCase{
	
	public void test1(){
		AbstractFactory factory = new Factory1();
		factory.createFlyable().fly(1000);
		factory.createMoveable().run(314);
		factory.createWriteable().write("hi,I love you...bye");
	}
	
}
