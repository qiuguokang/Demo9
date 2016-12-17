package com.qiu.demo3;
/**
 * 定义一个抽象类A
 * 
 * 属性  name
 * 
 * 方法 add sub
 */
public abstract class A {
	
	//属性
	
	private String name = "";
	
	//构造
	
	public A(String name){
		this.name = name;
	}
	
	//方法
	
	public abstract void add(int a,int b);
	
	public abstract void sub(int a,int b);

}
