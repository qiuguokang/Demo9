package com.qiu.demo2;
/**
 * ����һ��Bank�ⲿ��
 * 
 * ���ԣ� name money
 * 
 * ������show��in��out
 * 
 * ����һ��Boy�ڲ���
 *   ���ԣ�name
 *   ������outMoney
 * 
 * ����һ��girl�ڲ���
 *   ���ԣ�name
 *   ������inMoney
 */
public class Bank {
	
	//����  name money;
	private String name ="";
	private int money = 0;
	
	//���췽��
	public Bank(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	//��ͨ����
	
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
	
	//�ڲ���boy
	public class Boy{
		
		//����
		private String name = "";
		
		//����
		public Boy(String name){
			
			this.name = name;
		}
		
		//����
		public int outMoney(int count){
			
			money -= count;
			System.out.println(money);
			return count;
		}
	}
		
		//�ڲ���girl
		public class Girl{
			
			//����
			private String name = "";
			
			//����
			public Girl(String name){
				
				this.name = name;
		}
			
			//����
			public int inMoney(int count){
				
				money += count;
				System.out.println(money);
				return money;
		}	
	}
}
