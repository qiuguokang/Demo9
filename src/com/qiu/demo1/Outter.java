package com.qiu.demo1;
/**
 * ��һ������ṹ����
 * 
 * ��дһ���ⲿ��
 * 1 ����  name count
 * 2 ����  �вι���
 * 3 ���� 
 * ��дһ���ڲ���
 * 1 ���� 
 * 2 ����
 * 3 ����
 */
public class Outter {
	
	//����
	private String name1;
	
	private int count = 0;
	
	//���췽��
	
	public Outter(String name1){
		super();
		this.name1 = name1;	
	}
	
	//��ͨ����
	
	public String toString(){
		
		
		return "name1:"+name1;	
	}
	
	public void test1(){
		
		System.out.println("����һ���ⲿ��");
	}
	
	public void test3(){
		
		count++;
		System.out.println("count:"+count);
	}
	
	/**
	 * д���ڲ���
	 */
	public class Inner{
		
		//����
		
		private String name2 = "";
		
		private int count = 100;
		//����
		
		public Inner(String name2){
			
			this.name2 = name2;
		}
		//����
		public String toString(){
			
			return "name2:"+name2;
		}
		
		public void test2(){
			
			System.out.println("����һ���ڲ���");
			test3();
			
		}
				
		public void test3(){
			
			count++;
			
			System.out.println("count:"+count);
		}
	}

}
