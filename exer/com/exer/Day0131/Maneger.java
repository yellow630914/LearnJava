package com.exer.Day0131;

public class Maneger extends Employee {
	private double bonus;

	public Maneger(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Maneger(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("管理");
	}
	
	
	
}
