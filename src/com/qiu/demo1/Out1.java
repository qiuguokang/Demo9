package com.qiu.demo1;

public class Out1 {
	
	//���嶯̬����
	private int a1 = 10;
	//���徲̬����
	private static int a2 = 20;
    
	//���췽��
	
	public Out1() {
	}
    
	//��ͨ����
	public void testOut1(){
		
	}
	
	public static void testOut2(){
		System.out.println("a2:" + a2);
	}
	
	//��̬�ڲ���
	public class In1{
		
		//����
		
		//���嶯̬����
		private int b1 = 100;
		
		//���徲̬����
//		private static int b2 = 200;
		/*
		 * In1�ڲ����Ǹ���̬�ڲ��࣬�������о�̬��������
		 */
		
		//����
		public In1() {
		}
		
		//����
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
		
		//��Ϊ��̬�ڲ��࣬���治�����κξ�̬���أ����ԣ�������
//		public static void testIn4(){
//			
//		}
		
	}
}
