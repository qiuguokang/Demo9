package com.qiu.demo1;

public class Out1 {
	
	//定义动态变量
	private int a1 = 10;
	//定义静态变量
	private static int a2 = 20;
    
	//构造方法
	
	public Out1() {
	}
    
	//普通方法
	public void testOut1(){
		
	}
	
	public static void testOut2(){
		System.out.println("a2:" + a2);
	}
	
	//动态内部类
	public class In1{
		
		//属性
		
		//定义动态变量
		private int b1 = 100;
		
		//定义静态变量
//		private static int b2 = 200;
		/*
		 * In1内部类是个动态内部类，不能再有静态的因素了
		 */
		
		//构造
		public In1() {
		}
		
		//方法
		public void testIn1(){
			System.out.println("b1:" + b1);
		}
		
		public void testIn2(){
			a1++;
			System.out.println("a1:" + a1);
		}
		
		public void testIn3(){
			a2++;
			System.out.println("a2:" + a2);
		}
		
		//作为动态内部类，里面不再有任何静态因素（属性，方法）
//		public static void testIn4(){
//			
//		}
		
	}
}
