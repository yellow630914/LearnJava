package com.lijen.object_oriented_0120;

public class SuperFather {
	//屬性
	private String name;
	private int age;
	//構造器
	public SuperFather() {
		super();
	}
	public SuperFather(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//方法
	public void think() {
		System.out.println("普通的想想。");
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
	
	
}
