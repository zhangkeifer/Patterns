package com.zkf.test.factory.simplefactory;

import junit.framework.TestCase;

public class FactoryTest extends TestCase{

	public void test1(){
		SimpleFactory sf = new SimpleFactory();
		((Plane)(sf.create(Plane.class))).run();;
	}
	
}
