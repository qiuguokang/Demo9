package com.qiu.demo2;

import com.qiu.demo2.Bank.Boy;
import com.qiu.demo2.Bank.Girl;

public class TestBank {
	
	public static void main(String[] args) {
		
		//1 ����new�ⲿ��Ķ���
		Bank b = new Bank("ICBC", 20000);
		
		//2�������ⲿ��Ķ���ȥnew�ڲ���Ķ���
		Boy b1 = b.new Boy("ɵǿ");
		Boy b2 = b.new Boy("�ŷ�");
		
		Girl g1 = b.new Girl("��");
		Girl g2 = b.new Girl("��");
		
		b.show();
		b1.outMoney(500);
		g1.inMoney(1200);
		g2.inMoney(300);
		b2.outMoney(1000);
		b1.outMoney(200);
		g1.inMoney(800);
		b.show();
		
	}

}
