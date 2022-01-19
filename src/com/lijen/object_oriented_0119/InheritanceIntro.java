package com.lijen.object_oriented_0119;
/*
 * 物件導向的特徵之二:繼承性
 * 
 * 一、繼承性的好處:
 * 	(1)減少代碼的冗餘,提高代碼的復用性。
 * 	(2)便於拓展功能。
 *  (3)為之後的多態性的使用提供了前提。
 *  
 * 二、繼承性的格式:class A extends B{}
 * 	A:子類、派生類、subclass
 * 	B:父類、超類、基類、superclass
 * 
 * 	(1) 體現:一但子類A繼承父類B以後,子類A就獲取了父類B所聲明的結構:屬性、方法。
 *  	提醒:父類中聲明為private的屬性或方法,無法被子類值接調用,但這些屬性或方法確實存在於子類中。
 *  (2) 子類繼承父類後,還可以聲明自己特有的屬性或方法,實現功能的拓展。
 *  	子類和父類的關係,不同於子集合與父集合。
 *  extends:延展,拓展。
 *  
 * 三、Java中關於繼承性的規定:
 * 	(1)一個類可以被多個子類繼承。
 * 	(2)Java中類的單繼承性:一個類只能有一個父類。
 * 	(3)子父類是相對的概念。
 * 	(4)子類值接繼承的父類,稱為:值接父類。間接繼承的,稱為:間接父類。
 * 	(5)子類擁有直接與間接父類的所有方法與屬性。
 * 
 * 四、Object類	
 * 	(1)如果我們沒有顯式聲明一個類的父類,則此類值接繼承於java.lang.Object類
 * 	(2)所有java類都直接或間接繼承於Object類。
 */


public class InheritanceIntro {
	public static void main(String[] args) {
		Student s1 = new Student(59);
		
		s1.setName("vivi");
		System.out.println("這個學生叫: " + s1.getName());
	}
}

class Person{
	//屬性
	private String name;
	private int age;
	
	//構造器
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//GET,SET方法
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

class Student extends Person{
	//屬性
	private int grade;
	
	//構造器
	public Student() {
	}
	public Student(int grade) {
		this.grade = grade;
	}
	
	//GET,SET方法
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void call() {
		//這裡雖然繼承了Person但因為封裝性的關係,無法直接調用,需要使用get方法。
		System.out.println(getName());
	}
}
