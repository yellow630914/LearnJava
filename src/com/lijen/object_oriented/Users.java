package com.lijen.object_oriented;
/*
 * class中屬性(field)的使用
 * 
 * field vs 局部變數
 * 1.相同點:
 * 	(1)定義變量的格式: 數據類型 變數名 = 值
 * 	(2)先聲明,後使用。
 * 	(3)變數都有其作用域。
 * 
 * 2.不同點:
 * 	(1)在類中的聲明位置不同
 * 		屬性:直接被聲明在{}中
 * 	    局部變數:聲明在方法內、方法型參、代碼塊內、構造器內與構造器型參的變數。
 * 	(2)關於權限修飾符的不同(如:private,public,protected等)
 * 		屬性:可以在聲明時,指定權限。
 * 		局部變數:不可以使用權限修飾符的。
 * 	(3)默認初始化值
 * 		屬性:根據數據類型,皆有默認值。
 * 		局部變數:沒有默認值,若沒有初始值則報錯,型參在調用時賦值即可。
 * 	(4)內存中加載位置不一樣
 * 		屬性:加載到堆空間(heap)中 !!(不包括static屬性)
 * 		局部變數:加載到棧空間(stack)中
 */		
public class Users {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.id);
	}
}

class User{
	
	//屬性
	String name;
	int id;
	int age;
	
	//此方法內的language就是一種型參,是一種局部變數。
	public void talk(String language) {
		System.out.println(language);
	}
	
	public void eat() {
		String food = "飯";  //在方法內聲明的food也是一種局部變數。
		System.out.println("吃" + food);
	}
}
