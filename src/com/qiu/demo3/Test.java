package com.qiu.demo3;

public class Test {
	
	public static void main(String[] args) {
		
		/**
		 * （1）抽象类，能不能声明引用变量？（可以）
		 * （2）抽象类，能不能实例化（new对象）（不可以）
		 * （3）抽象类，能不能被继承    （可以）
		 * （4）抽象类可不可以继承自抽象类     （可以）
		 * （5）抽象类可不可以没有抽象方法  （可以）
		 */
		//声明抽象类的引用变量
	    A a1 = null;
	    B b1 = null;
		C c = new C("算不准品牌");
		
		c.add(10, 5);
		c.sub(10, 5);
		c.mul(10, 5);
		c.div(10,5);
	}
}
