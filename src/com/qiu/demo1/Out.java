package com.qiu.demo1;
/**
 * ��̬�ڲ���
 */

//�ⲿ��
public class Out {
	
	//����
	
	private int a1 = 10;
	private static int a2 = 20;
	//����
	
	public Out(){
		
	}
	//����
	public void testA1(){
	
	}
	
	/**
	 * ��̬�ڲ���
	 */
	public static class In{
	
		/**
		 * ��Ϊ��̬�ڲ��࣬������������ԣ��������Ǿ�̬�ģ�
		 * û��static���εģ�ҲĬ��Ϊ��̬��
		 */
	    //����
		private int b1 = 100;
		private int b2 = 200;
		
		//����
		public In(){
			
		}
		
		//����
		public void testB1(){
			
			System.out.println("b1:"+b1+",b2:"+b2);
		}
		
		public void testB2(){
			
			//�����Է��ʶ�̬���� (���Ĳ������涯��)
		//	a1++;
			//���Է��ʾ�̬����
			a2++;
			System.out.println(a2++);
		}	
	}
}
