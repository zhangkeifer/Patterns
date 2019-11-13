package com.FlammulinaBlog.原型模式;

public class Test {
	
	public static void main(String[] args) {
		
	}
	
	@org.junit.Test
	public void test1(){
		Prototype1 p1 = new Prototype1();
		try {
			System.out.println(p1.clone());;
			System.out.println(p1.deepClone());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
