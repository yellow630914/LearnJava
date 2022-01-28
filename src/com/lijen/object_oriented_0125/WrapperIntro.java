package com.lijen.object_oriented_0125;

import org.junit.Test;
/*
 * 包裝類的使用:
 * 1.java提供了8種基本數據類型的包裝類,使得基本數據類型也具有類的特徵。
 * 2.掌握的:基本數據類型、包裝類、String三者之間的轉換
 * 
 * 
 */

public class WrapperIntro {
	
	//基本數據類型轉換成包裝類:調用包裝類的構造器。
	@Test
	public void test1() {
		System.out.println("基本數據類型轉換成包裝類:調用包裝類的構造器:");
		int num1 = 1;
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString()); //123
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString()); //123
		
		Float f1 = new Float(12.9);
		Float f2 = new Float("12.9");
		System.out.println(f1.equals(f2)); //true
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		System.out.println(b1.equals(b2)); //true
		
		Boolean b3 = new Boolean("true123");
		System.out.println(b3.toString()); //false
	}
	//包裝類轉換成基本數據類型
	@Test
	public void test2() {
		System.out.println("包裝類轉換成基本數據類型:");
		Integer in1 = new Integer(12);
		
		int i1 = in1.intValue();
		System.out.println(i1 + 1);
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2 + 1);
	}
	
	//自動拆裝箱
	@Test
	public void test3() {
		System.out.println("自動拆裝箱:");
		int num1 = 10;
		method(num1);
		
		//自動裝箱
		Integer in1 = num1;
		method(in1);
		
		//自動拆箱
		System.out.println(in1 + 1);
	}
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	//基本數據類型與包裝轉化至String
	@Test
	public void test4() {
		System.out.println("轉化至String:");
		int num1 = 12;
		//方式1:連接運算
		String str1 = num1 + "";
		System.out.println(str1);
		
		float f1 = 15.6f;
		//方式2:調用String的valueOf
		String str2 = String.valueOf(f1);
		System.out.println(str2);
		
		Double d1 = 55.6d;
		String str3 = String.valueOf(d1);
		System.out.println(str3);
	}
	
	//String轉化至基本數據類型與包裝類
	@Test
	public void test5() {
		System.out.println("String轉化至基本數據類型與包裝類:");
		
		String str1 = "123";
		
//		錯誤:
//		int num1 = (int)str1;
//		Integer num2 = (Integer)str1;
		
		int i1 = Integer.parseInt(str1);
		System.out.println(i1 +1);
		
		String str2 = "true1";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
		
		
	}
}
