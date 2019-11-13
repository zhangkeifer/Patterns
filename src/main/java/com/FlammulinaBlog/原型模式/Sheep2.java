package com.FlammulinaBlog.原型模式;

import java.util.Date;

/**
 * 深复制
 */
public class Sheep2 implements Cloneable{//Cloneable为标记接口
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();//直接调用object对象的clone()方法

        //添加如下代码实现深复制(Deep Clone)
        Sheep2 s = (Sheep2) obj;
        s.birthday = (Date) this.birthday.clone();//属性克隆！

        return obj;
    }

    public Sheep2() {
    }

    public Sheep2(String sname, Date birthday) {
        super();
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
    	Date date = new Date(3333332323L);
        Sheep2 s1 = new Sheep2("少利", date);
        Sheep2 s2 = (Sheep2) s1.clone();

        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        date.setTime(332324355555555L);//浅复制：s1和s2指向同一date对象的地址，一改全改
        System.out.println(s1.getBirthday());//s1.getBirthday() == s2.getBirthday()

        s2.setSname("多利");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
	}
}