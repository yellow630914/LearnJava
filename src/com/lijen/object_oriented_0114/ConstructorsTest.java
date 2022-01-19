package com.lijen.object_oriented_0114;

/*
 * 類的結構之三:構造器(Constructors)的使用
 * 
 * 一、構造器的作用:
 * 	1.創造物件
 *  2.初始化物件的信息
 * 二、說明:
 * 	1.如果類沒有定義構造器,則系統提供一個空參的構造器。
 *  2.定義構造器的格式:權限修飾符 類名(型參列表){}。
 *  3.一個類中定義多個構造器,彼此構成重載。
 *  4.一旦我們定義了類的構造器,系統就不再提供空參構造器。 
 *  5.一個類中至少會有一個構造器。
 *  
 *  
 */

public class ConstructorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Person()其實就是new+構造器 
		Person p1 = new Person();
		
		p1.show();
		
		//使用構造器創建物件,並初始化。
		Person p2 = new Person("Tom",18);
		
		p2.show();

	}

}

class Person{
	//屬性
	String name;
	int age;
	//構造器
	public Person() {
		System.out.println("Person()....");
	}
	//可以創建多個構造器,彼此構成重載。
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//方法
	public void show() {
		System.out.println("name = " + name + ",age = " + age);
	}
}
