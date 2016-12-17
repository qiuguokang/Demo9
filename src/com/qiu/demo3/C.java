package com.qiu.demo3;
/**
 * 创建一个普通类C，基础抽象类B
 *
 */
public class C extends B{

	//继承父类B的构造
	public C(String name) {
		super(name);
	}
    
	//当普通类继承抽象类的时候，必须把抽象类中没有完成的抽象方法全部完成。
	@Override
	public void mul(int a, int b) {
		
		int c = a * b;
		System.out.println(a+"*"+b+"="+c);
	}

	@Override
	public void div(int a, int b) {
		
		int c = a / b;
		System.out.println(a+"/"+b + "="+ c);	
	}

	@Override
	public void add(int a, int b) {
	
		int c = a + b;
		System.out.println(a+"+"+b+"="+c);	
	}

	@Override
	public void sub(int a, int b) {
		
		int c = a - b;
		System.out.println(a+"-"+b+"="+c);	
	}

}
