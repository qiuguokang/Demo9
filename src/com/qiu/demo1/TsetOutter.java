package com.qiu.demo1;

import com.qiu.demo1.Outter.Inner;

public class TsetOutter {
	
	public static void main(String[] args) {
		
		//�ⲿ��	
//		Outter out = new Outter("����");
//		System.out.println(out);
//		out.test1();
		
		//�ڲ���
		
//		Inner in = new Inner();  �ڲ��಻��������new����
		
		// 1���ȴ����ⲿ��
		Outter out = new Outter("����");
//		System.out.println(out);
//		out.test1();
		
		// 2����ͨ���ⲿ��Ķ���ȥnew�ڲ���Ķ���
		Inner in = out.new Inner("����");
		System.out.println(in);
		
		// ��test2���������test3��
		// ���ڲ��࣬û��test3ʱ�����Ե����ⲿ���test3����
		// �����ڲ������д��test3ʱ���ڲ����test3�Ḳ�ǵ��ⲿ���test3��
		in.test2();
		
		// �ڲ���ֻ�����ڵ�ǰ���з��ʵ��ⲿ��ı�����������
		// ���˵�ǰ�࣬�ͷ��ʲ����ⲿ�˵ı���������
		//in.test3
		
		/**
		 * �ڲ������ʵ������
		 * ��1�����������ⲿ��Ķ���
		 * ��2��ͨ���ⲿ��Ķ���new�ڲ���Ķ���
		 * ���ԣ�
		 * ��1���ڲ�����Է����ⲿ������ԣ�����
		 * ��2���ڲ������ԣ��������ⲿ������ԣ������������ڲ��า���ⲿ��
		 */
		
	}

}
