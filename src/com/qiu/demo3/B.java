package com.qiu.demo3;
/**
 * ����һ��������B���̳��Գ�����A
 */
public abstract class B extends A {
	
	//���ԣ��̳�A�����ԣ�
	
	//���죨��������A�Ĺ��죩
	public B(String name){
		super(name);
	}
	
	//����
	public abstract void mul(int a,int b);
	
	public abstract void div(int a,int b);

}
