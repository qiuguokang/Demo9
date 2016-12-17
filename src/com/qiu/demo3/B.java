package com.qiu.demo3;
/**
 * 定义一个抽象类B，继承自抽象类A
 */
public abstract class B extends A {
	
	//属性（继承A的属性）
	
	//构造（基础父类A的构造）
	public B(String name){
		super(name);
	}
	
	//方法
	public abstract void mul(int a,int b);
	
	public abstract void div(int a,int b);

}
