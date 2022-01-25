package com.lijen.object_oriented_0125;

import java.util.Date;

/*
 * 面試題: ==和equals()的區別
 * 
 * 一、回顧==的使用:
 * 	== : 運算符
 * 	1.可以使用在基本數據類型變亮和引用數據類型中
 * 	2.如果比較的是基本數據類型變量:比較變量保存的數據是否相等。
 * 	3.如果比較的是引用數據類型變量:比較變量保存的地址值是否相等。
 * 
 * 二、equals()方法的使用:
 * 	1.是一個方法,而非運算符。
 * 	2.只能適用於引用數據類型。
 * 	3.Object類中的equals()定義:
 * 		public boolean equals(Object obj) {
        	return (this == obj);
    	}
    	說明:Object類中定義的equals()與==相同,比較兩地址值是否相同。
    4.像String、File、Date、包裝類等等,都重寫了Object的equals()方法,重寫後
      比較的不是地址值了,而是實體內容。
 * 	5.通常情況下,我們自定義的類,如果使用equals()的話也是希望他去比較實體內容的。
 */
public class EqualsTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		double d = 10;
		
		System.out.println("----------基本數據類型----------");
		System.out.println(i == j); //true
		System.out.println(i == d); //true
		
		char c = 10;
		System.out.println(c == i); //true
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);//true
		
		System.out.println("----------引用數據類型----------");
		//--------------------------
		
		Customer cust1 = new Customer("Tom",21);
		Customer cust2 = new Customer("Tom",21);
		System.out.println(cust1 == cust2); //false
		
		String s1 = "lijen";
		String s2 = "lijen";
		
		System.out.println("----------使用equals----------");
		//--------------------------
		
		System.out.println(cust1.equals(cust2)); //false
		System.out.println(s1.equals(s2)); //true
		
		Date date1 = new Date(31315611L);
		Date date2 = new Date(31315611L);
		System.out.println(date1.equals(date2)); //true
		
		System.out.println("----------equals重寫----------");
		//--------------------------
		Person p1 = new Person("Adam",15);
		Person p2 = new Person("Adam",15);
		System.out.println(p1.equals(p2));//true
	}
}

class Customer{
	String name;
	int age;
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
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Customer() {
		super();
	}
}

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
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
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) {
			return true;
		}
		if(obj instanceof Person) {
			Person per = (Person)obj;
			if(this.age == per.age && this.name == per.name) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
