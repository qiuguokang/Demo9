package com.qiu.demo3;
/**
 * ����һ����ͨ��C������������B
 *
 */
public class C extends B{

	//�̳и���B�Ĺ���
	public C(String name) {
		super(name);
	}
    
	//����ͨ��̳г������ʱ�򣬱���ѳ�������û����ɵĳ��󷽷�ȫ����ɡ�
	@Override
	public void mul(int a, int b) {
		
		int c = a * b;
		System.out.println(a+"*"+b+"="+c);
	}

	@Override
	public void div(int a, int b) {
		
		int c = a / b;
		System.out.println(a+"/"+b + "="+ c);	
	}

	@Override
	public void add(int a, int b) {
	
		int c = a + b;
		System.out.println(a+"+"+b+"="+c);	
	}

	@Override
	public void sub(int a, int b) {
		
		int c = a - b;
		System.out.println(a+"-"+b+"="+c);	
	}

}
