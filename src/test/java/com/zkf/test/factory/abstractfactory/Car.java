package com.zkf.test.factory.abstractfactory;

public class Car implements Moveable{

	@Override
	public void run(int speed) {
		System.out.println("我是一辆小汽车，目前的速度是:"+speed+"/小时");
	}

}
