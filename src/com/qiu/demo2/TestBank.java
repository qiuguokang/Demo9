package com.qiu.demo2;

import com.qiu.demo2.Bank.Boy;
import com.qiu.demo2.Bank.Girl;

public class TestBank {
	
	public static void main(String[] args) {
		
		//1 ）先new外部类的对象
		Bank b = new Bank("ICBC", 20000);
		
		//2）再用外部类的对象去new内部类的对象
		Boy b1 = b.new Boy("傻强");
		Boy b2 = b.new Boy("张飞");
		
		Girl g1 = b.new Girl("赵");
		Girl g2 = b.new Girl("王");
		
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
