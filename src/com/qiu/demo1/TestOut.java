package com.qiu.demo1;

//import com.qiu.demo1.Out.In;

public class TestOut {
	
	public static void main(String[] args) {
		
		Out.In in = new Out.In();
//		In in = new In();
		in.testB1();
		in.testB2();
		
		/**
		 * 静态内部类
		 * 
		 * 可以用两种方式去实例化(new 对象)
		 * 1)把静态内部类看出一个特殊的静态属性
		 *   用类名取调用它去new对象
		 *   Out.In in = new Out In();
		 * 2)先导包
		 *   import com.qiu.demo1.Out.In;
		 *   然后直接取new对象
		 *   In in = new In();  
		 */
	}
        
}
