package com.lijen.object_oriented_0130;
/*
 * 類的成員之四:代碼塊(或初始化塊)
 * 
 * 1.代碼塊的作用:用來初始化類、對象
 * 2.代碼塊如果有修飾的話,只能用static。
 * 3.分類:靜態代碼塊 vs 非靜態代碼塊
 * 		靜態代碼塊:
 * 			-可以有輸出語句。
 * 			-隨著類的加載而執行,且只執行一次。
 * 			-作用:初始化類的信息。
 * 			-若一個類中定義多個靜態代碼塊,則按照聲明先後執行。
 * 		非靜態代碼塊:
 * 			-可以有輸出語句。
 * 			-隨著物件的創建而執行。
 * 			-每創建一次物件就執行一次。
 * 			-作用:可以在創建物件時,可以對物件的屬性等進行初始化。
 * 			-若一個類中定義多個非靜態代碼塊,則按照聲明先後執行。
 * 	4.由父及子,由靜到非。
 * 	5.對屬性父值的先後順序:
 * 		默認初始化 > 顯示初始化 > 代碼塊賦值 > 構造器初始化 > 物件.屬性 or 物件.方法
 * 
 */
public class BlockIntro {
	public static void main(String[] args) {
		String t1 = Person.think;
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		
	}
}

class Person{
	//屬性
	String name;
	int age;
	static String think = "我思故我在";
	
	//構造器
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//代碼塊
	//靜態代碼塊
	static{
		System.out.println("static block");
	}
	//非靜態代碼塊
	{
		System.out.println("normal block");
	}
	
	//方法
	
}
