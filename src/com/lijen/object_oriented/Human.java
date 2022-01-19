
package com.lijen.object_oriented;

public class Human {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//創建一個Person類的物件
		Person p1 = new Person();
		
		//調用屬性
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//調用方法
		p1.eat();
		String say = "再買更多卡。";
		p1.talk(say);
		
		//********************************************
		//創建另一個物件
		Person p2 = new Person();
		//輸出另一個物件的name,可知每個物件間是不同的。
		System.out.println(p2.name);
		System.out.println(p2.isMale);
		
		//*********************************************
	}
}

/* 如何設計一個類?
 * 一個類通常有幾個部分。
 * 
 * 屬性 = Field = 成員變量,類似一個人的基本信息,如身高。
 * 方法 = Method = 函數,類似一個人能做什麼,如技能。
 * 
 * */

class Person{
	
	//Field屬性
	String name;
	int age;
	boolean isMale;
	
	//Method方法
	public void eat() {
		System.out.println("吃吃吃");
	}
	
	public void sleep() {
		System.out.println("睡睡睡");
	}
	
	public void talk(String language) {
		System.out.println("我說:" + language);
	}
	
	
	
}
