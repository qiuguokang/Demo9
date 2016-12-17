package com.qiu.demo1;

import com.qiu.demo1.Outter.Inner;

public class TsetOutter {
	
	public static void main(String[] args) {
		
		//外部类	
//		Outter out = new Outter("张三");
//		System.out.println(out);
//		out.test1();
		
		//内部类
		
//		Inner in = new Inner();  内部类不可以这样new对象
		
		// 1）先创建外部类
		Outter out = new Outter("张三");
//		System.out.println(out);
//		out.test1();
		
		// 2）再通过外部类的对象去new内部类的对象
		Inner in = out.new Inner("李四");
		System.out.println(in);
		
		// 在test2里面调用了test3，
		// 当内部类，没有test3时，可以调用外部类的test3方法
		// 当在内不类里，有写了test3时，内部类的test3会覆盖掉外部类的test3；
		in.test2();
		
		// 内部类只可以在当前类中访问到外部类的变量，方法，
		// 出了当前类，就访问不到外部了的变量，方法
		//in.test3
		
		/**
		 * 内部类如何实例化？
		 * （1）必须先有外部类的对象。
		 * （2）通过外部类的对象new内部类的对象。
		 * 特性：
		 * （1）内部类可以访问外部类的属性，方法
		 * （2）内部类属性，方法与外部类的属性，方法重名，内部类覆盖外部类
		 */
		
	}

}
