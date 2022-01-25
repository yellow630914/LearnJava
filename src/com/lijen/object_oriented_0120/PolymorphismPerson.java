package com.lijen.object_oriented_0120;

public class PolymorphismPerson {
	//屬性
	String name;
	int age;
	//構造器
	public PolymorphismPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public PolymorphismPerson() {
		super();
	}
	//GetSet方法
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
	//方法
	public void eat() {
		System.out.println("吃吃");
	}
	
}
