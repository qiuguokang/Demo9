package com.qiu.demo2;
/**
 * 创建一个Bank外部类
 * 
 * 属性： name money
 * 
 * 方法：show，in，out
 * 
 * 创建一个Boy内部类
 *   属性：name
 *   方法：outMoney
 * 
 * 创建一个girl内部类
 *   属性：name
 *   方法：inMoney
 */
public class Bank {
	
	//属性  name money;
	private String name ="";
	private int money = 0;
	
	//构造方法
	public Bank(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	//普通方法
	
	public void show(){
		System.out.println("name:"+name+",money:"+money);
	}
	
	public void in(int money){
		
		this.money += money;
		System.out.println(money);
	}
	
	public void out(int count){
		
//	    money = money - count;
		money -= count;
		System.out.println(money);	
	}
	
	//内部类boy
	public class Boy{
		
		//属性
		private String name = "";
		
		//构造
		public Boy(String name){
			
			this.name = name;
		}
		
		//方法
		public int outMoney(int count){
			
			money -= count;
			System.out.println(money);
			return count;
		}
	}
		
		//内部类girl
		public class Girl{
			
			//属性
			private String name = "";
			
			//构造
			public Girl(String name){
				
				this.name = name;
		}
			
			//方法
			public int inMoney(int count){
				
				money += count;
				System.out.println(money);
				return money;
		}	
	}
}
