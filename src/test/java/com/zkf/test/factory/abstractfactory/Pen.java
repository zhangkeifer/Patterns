package com.zkf.test.factory.abstractfactory;

public class Pen implements Writeable {

	@Override
	public void write(String content) {
		System.out.println("我是一支钢笔。我刚刚写下一句："+content);
	}

}
