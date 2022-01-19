package com.lijen.object_oriented_0118;
/*
 * this的使用:
 * 	1.this可以用來修飾:屬性、方法、構造器。
 * 	2.this修飾屬性和方法
 * 	  this理解為:當前物件
 * 	  
 * 	 (1)在class的方法中,我們可以用"this."去調用屬性或方法,通常我們都省略。
 * 	  	但在行參與淚的屬性同名時,我們必須使用"this."去表明變數是否為屬性。
 * 	 (2)在class的構造器中,我們可以用"this."去調用屬性或方法,通常我們都省略。
 * 	  	但在行參與淚的屬性同名時,我們必須使用"this."去表明變數是否為屬性。
 * 	3.this調用構造器:
 * 	 (1)在構造器中,我們可以用this(行參列表)的方式調用同類的其他構造器。
 * 	 (2)不能調用自己。
 * 	 (3)調用不能成為一個閉環。
 * 	 (4)this(型參列表)必須在構造器的首行。
 * 	 (5)一個構造器只能調用一次別的構造器。
 * 
 */
public class ThisTest {
	
}

class Person{
	//屬性
	private String name;
	private int age;
	//構造器
	public Person() {
		System.out.println("初始化");
	}
	public Person(String name) {
		this();
		this.name = name;
	}
	public Person(int age) {
		this();
		this.age = age;
	}
	public Person(String name,int age) {
		this(name);
		this.age = age;
	}
	//方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
