package com.qiu.demo4;
/**
 * ����һ��������Member
 * 
 * ���ԣ�name, age;
 * 
 * ������4�����󷽷�   getup, work, play, sleep;
 */
public abstract class Member {
	
	//����
	private String name;
	private int age;
	
	//����
	
	public Member(String name,int age){
		super();
		this.name = name;
		this.age = age;
	}
	
	//���󷽷�
	
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
