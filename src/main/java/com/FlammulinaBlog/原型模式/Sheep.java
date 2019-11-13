package com.FlammulinaBlog.原型模式;

import java.util.Date;


public class Sheep  implements Cloneable{

	private String name;
	private Date birth;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Object obj = super.clone(); //浅复制  //直接调用object对象的clone()方法
		//添加如下代码实现深复制(Deep Clone)
        Sheep s = (Sheep) obj;
        s.birth = (Date) this.birth.clone();//属性克隆！
		return obj;
	}
	
	public Sheep(){}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public Sheep(String name,Date birth){
		this.name = name;
		this.birth = birth;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(3333332323L);
		Sheep s1 = new Sheep("多利",date);
		Sheep s2 = (Sheep)s1.clone();
		
		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirth());
		date.setTime(332324355555555L);//浅复制：s1和s2指向同一date对象的地址，一改全改
        System.out.println(s1.getBirth());//s1.getBirthday() == s2.getBirthday()

        s2.setName("多利");
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirth());
		
	}
	
	
}
