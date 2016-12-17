package com.qiu.demo4;
/**
 * 定义一个普通类Fatehr继承自抽象类Member
 *
 * 属性：全部继承自Member,没有自己的属性
 * 
 * 方法：继承自Member,有一个自己的intro方法
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
		
		System.out.println("每天早上7点起床");
	}

	@Override
	public void work() {
		
		System.out.println("每天工作至少工作11个小时");
	}

	@Override
	public void play() {
		
		System.out.println("每天加班2小时");
	}

	@Override
	public void sleep() {
		
		System.out.println("每天晚上1点睡觉");
	}

}
