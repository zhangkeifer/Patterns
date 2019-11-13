package com.zkf.test.factory.factorymethod;
/**
 * 具体工厂
 * @author zhangkaifu
 *
 */
public class BroomFactory extends VehicleFactory {

	@Override
	public Moveable create() {
		return new Broom();
	}

}
