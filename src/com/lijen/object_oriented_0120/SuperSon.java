package com.lijen.object_oriented_0120;

public class SuperSon extends SuperFather {
	//屬性
	private int intelligence;
	//構造器
	public SuperSon(int intelligence,String name,int age) {
		//調用父類的構造器
		super(name,age);
		this.intelligence = intelligence;
	}
	public SuperSon(int intelligence) {
		this.intelligence = intelligence;
	}
	public SuperSon() {
	}
	//方法
	@Override
	public void think() {
		System.out.println("我思故我在");
	}
	public void invention() {
		System.out.println("燈泡!");
	}
	public void show() {
		System.out.print(this.getName() + "在" + super.getAge() + "發明了");
		this.invention();
	}
	//GetSet方法
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	
	
	
}
