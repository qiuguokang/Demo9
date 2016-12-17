package com.qiu.demo3;
/**
 * 定义一个没有抽象方法的抽象类
 * 
 */
public abstract class Abstract1 {
	
	//属性
	private int a = 10;
	private int b = 20;
	
	//构造
	public Abstract1() {
		super();
	}
	
	//方法
	
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
