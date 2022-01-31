package com.lijen.object_oriented_0131;
/*
 * 抽象類:
 * 	當一一個類的子類夠多,多到足夠覆蓋所有需求,以至於父類已經不需要被實例化後,此一類就可以被設計為抽象類。
 * 
 * abstract(抽象的)的使用:
 * 	1.abstract可以用來修飾:類、方法。
 * 	2.abstract修飾類:抽象的
 * 		-此類不能實例化
 * 		-抽象類中一定有構造器,以便子類實例化調用。
 * 		-開發中,都會提供抽象類的子類,讓子類物件實例化。
 * 	3.abstract修飾方法:
 * 		-抽象方法只有方法的聲明,沒有方法體。
 * 		-包含抽象方法的類,一定是抽象類。反之,抽象類中可以沒有抽象方法
 * 		-子類必須重寫了父類中所有抽象方法,才可實例化。
 * 		-若子類沒有重寫所有父類中的抽象方法,則此類也是一個抽象類,需要使用abstract修飾對應方法。
 * 	4.abstract不能修飾:屬性、構造器。
 * 	5.abstract不能修飾私有方法、靜態方法、final的方法與類。
 * 
 */
public class AbstractClassIntro {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s1 = new Student(72,"Tom",15);
		s1.eat(); //非匿名的類非匿名的物件
		
		/*
		 * 抽象類的匿名子類
		 * 
		 */
		
		method(new Student()); //非匿名的類匿名物件
		
		//匿名類非匿名物件
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("匿名類吃吃");
			}
		};
		p.eat();
		
		new Person() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("雙匿名吃吃");
			}
		}.eat();
	}
	
	public static void method(Person p) {
		p.eat();
	}

}

abstract class Person{
	String name;
	int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public void think() {
		System.out.println("思考");
	}
	public abstract void eat();
}

class Student extends Person{
	double grade;

	
	public Student() {
		super();
	}
	public Student(double grade) {
		super();
		this.grade = grade;
	}
	public Student(String name,int age) {
		super(name,age);
		
	}
	public Student(double grade,String name,int age) {
		super(name,age);
		this.grade = grade;
	}
	@Override
	public void eat() {
		System.out.println("學生吃吃");
	}
}
