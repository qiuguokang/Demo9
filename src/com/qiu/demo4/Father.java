package com.qiu.demo4;
/**
 * ����һ����ͨ��Fatehr�̳��Գ�����Member
 *
 * ���ԣ�ȫ���̳���Member,û���Լ�������
 * 
 * �������̳���Member,��һ���Լ���intro����
 */
public class Father extends Member{

	public Father(String name, int age) {
		super(name, age);
	}
	
	public void intro(){
		
		System.out.println("name:"+getName()+",age:"+getAge());
	}
	@Override
	public void getup() {
		
		System.out.println("ÿ������7����");
	}

	@Override
	public void work() {
		
		System.out.println("ÿ�칤�����ٹ���11��Сʱ");
	}

	@Override
	public void play() {
		
		System.out.println("ÿ��Ӱ�2Сʱ");
	}

	@Override
	public void sleep() {
		
		System.out.println("ÿ������1��˯��");
	}

}
