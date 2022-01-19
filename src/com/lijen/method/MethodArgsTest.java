package com.lijen.method;

/*
 * 可變個數型參的方法
 * 
 * 1.jdk 5.0新增的內容
 * 2.具體使用:
 * 	(1)可變個數型參格式:數據類型 ... 變數名
 * 	(2)當調用可變個數型參方法時,傳入的參數可以是,0個、1個、2個...多個。
 * 	(3)可變個數型參的方法與本類中相同方法名不同型參的方法之間構成重載。
 * 	(4)編譯器認為Array型參與可變個數型參是相同的,兩者間不能共存。
 * 	(5)可變個數型參在方法的型參中,只能聲明在末尾。
 */

public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello");
		test.show("hello","world");
	}
	
	//使用型參int
	public void show(int i) {
		System.out.println(i);
	}
	//使用型參String
	public void show(String s) {
		System.out.println(s);
	}
	//可變個數型參,格式是使用...
	public void show(String ... strings ) {
		//可變個數型參可以視做一個Array,此輸出第一個輸入的型參。
		System.out.println(strings[0]);
	}
	
	
	//編譯器認為Array型參與可變個數型參是相同的
//	public void show(String[] strings ) {
//		System.out.println(strings[0]);
//	}
	
	public void show(int i,String ... strings ) {
		//可變個數型參可以視做一個Array,此輸出第一個輸入的型參。
		System.out.println(strings[i]);
	}
	
	//編譯器無法識別可變型參在前的方法
//	public void show(String ... strings,int i) {
//		//可變個數型參可以視做一個Array,此輸出第一個輸入的型參。
//		System.out.println(strings[i]);
//	}
	
}
