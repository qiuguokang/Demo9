package com.qiu.demo4;
/**
 * 定义一个抽象类Member
 * 
 * 属性：name, age;
 * 
 * 方法：4个抽象方法   getup, work, play, sleep;
 */
public abstract class Member {
	
	//属性
	private String name;
	private int age;
	
	//构造
	
	public Member(String name,int age){
		super();
		this.name = name;
		this.age = age;
	}
	
	//抽象方法
	
	public abstract void getup();
	
	public abstract void work();
	
	public abstract void play();
	
	public abstract void sleep();

	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
