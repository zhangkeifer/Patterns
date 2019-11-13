package com.zkf.test.factory.factorymethod;
/**
 * 具体产品
 * @author zhangkaifu
 *
 */
public class Broom implements Moveable {

	@Override
	public void run() {
		System.out.println("Broom run...");
	}

}
