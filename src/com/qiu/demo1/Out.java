package com.qiu.demo1;
/**
 * 静态内部类
 */

//外部类
public class Out {
	
	//属性
	
	private int a1 = 10;
	private static int a2 = 20;
	//构造
	
	public Out(){
		
	}
	//方法
	public void testA1(){
	
	}
	
	/**
	 * 静态内部类
	 */
	public static class In{
	
		/**
		 * 作为静态内部类，里面的所以属性，方法都是静态的，
		 * 没用static修饰的，也默认为静态的
		 */
	    //属性
		private int b1 = 100;
		private int b2 = 200;
		
		//构造
		public In(){
			
		}
		
		//方法
		public void testB1(){
			
			System.out.println("b1:"+b1+",b2:"+b2);
		}
		
		public void testB2(){
			
			//不可以访问动态变量 (静的不可以玩动的)
		//	a1++;
			//可以访问静态变量
			a2++;
			System.out.println(a2++);
		}	
	}
}
