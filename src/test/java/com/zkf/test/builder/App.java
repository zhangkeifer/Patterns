package com.zkf.test.builder;

import junit.framework.TestCase;

public class App extends TestCase {
	
	public void test1(){
		PersonDirector pd = new PersonDirector();
		Person p = pd.constructPerson(new ManBuilder());
		System.out.println(p.getHead());
		System.out.println(p.getBody());
		System.out.println(p.getFoot());
	}
	
}
