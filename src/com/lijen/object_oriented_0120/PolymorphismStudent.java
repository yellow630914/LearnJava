package com.lijen.object_oriented_0120;

public class PolymorphismStudent extends PolymorphismPerson {
	//屬性
	int grade;
	//構造器
	public PolymorphismStudent(int grade) {
		super();
		this.grade = grade;
	}
	public PolymorphismStudent() {
		super();
	}
	//GETSET方法
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	//方法
	public void eat() {
		System.out.println("學生吃吃");
	}
	public void study() {
		System.out.println("讀書");
	}
	
	
	
	
}
