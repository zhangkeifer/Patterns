package com.zkf.test.factory.factorymethod;

import junit.framework.TestCase;

public class App extends TestCase{

	public void test1(){
		VehicleFactory factory = new BroomFactory();
		Moveable moveable = factory.create();
		moveable.run();
	}
	
}
