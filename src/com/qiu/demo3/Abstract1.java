package com.qiu.demo3;
/**
 * ����һ��û�г��󷽷��ĳ�����
 * 
 */
public abstract class Abstract1 {
	
	//����
	private int a = 10;
	private int b = 20;
	
	//����
	public Abstract1() {
		super();
	}
	
	//����
	
	public void add(){
		int c = a + b ;
		System.out.println(c);
	}
	
	public void sub(){
		
		int c = a - b;
		System.out.println(c);
	}
	
	//getter,setter;
	
	public int getA(){
		
		return a;
	}
	
	public void setA(int a){
		
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

}
