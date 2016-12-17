package com.qiu.demo1;
/**
 * 建一个内外结构的类
 * 
 * 先写一个外部类
 * 1 属性  name count
 * 2 构造  有参构造
 * 3 方法 
 * 再写一个内部类
 * 1 属性 
 * 2 构造
 * 3 方法
 */
public class Outter {
	
	//属性
	private String name1;
	
	private int count = 0;
	
	//构造方法
	
	public Outter(String name1){
		super();
		this.name1 = name1;	
	}
	
	//普通方法
	
	public String toString(){
		
		
		return "name1:"+name1;	
	}
	
	public void test1(){
		
		System.out.println("这是一个外部类");
	}
	
	public void test3(){
		
		count++;
		System.out.println("count:"+count);
	}
	
	/**
	 * 写个内部类
	 */
	public class Inner{
		
		//属性
		
		private String name2 = "";
		
		private int count = 100;
		//构造
		
		public Inner(String name2){
			
			this.name2 = name2;
		}
		//方法
		public String toString(){
			
			return "name2:"+name2;
		}
		
		public void test2(){
			
			System.out.println("这是一个内部类");
			test3();
			
		}
				
		public void test3(){
			
			count++;
			
			System.out.println("count:"+count);
		}
	}

}
