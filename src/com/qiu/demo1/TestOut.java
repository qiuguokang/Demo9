package com.qiu.demo1;

//import com.qiu.demo1.Out.In;

public class TestOut {
	
	public static void main(String[] args) {
		
		Out.In in = new Out.In();
//		In in = new In();
		in.testB1();
		in.testB2();
		
		/**
		 * ��̬�ڲ���
		 * 
		 * ���������ַ�ʽȥʵ����(new ����)
		 * 1)�Ѿ�̬�ڲ��࿴��һ������ľ�̬����
		 *   ������ȡ������ȥnew����
		 *   Out.In in = new Out In();
		 * 2)�ȵ���
		 *   import com.qiu.demo1.Out.In;
		 *   Ȼ��ֱ��ȡnew����
		 *   In in = new In();  
		 */
	}
        
}
