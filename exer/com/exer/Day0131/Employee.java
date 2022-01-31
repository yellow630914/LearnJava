package com.exer.Day0131;

public abstract class Employee {
	//屬性
	private String name;
	private int id;
	private double salary;
	
	//構造器
	public Employee() {
		super();
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//方法
	public abstract void work();
	
}
