package com.lijen.object_oriented_0120;

public class PolymorphismEightPlusNine extends PolymorphismPerson {
	//屬性
	int isSmoking;
	//構造器
	public PolymorphismEightPlusNine() {
		super();
	}
	public PolymorphismEightPlusNine(int isSmoking) {
		super();
		this.isSmoking = isSmoking;
	}
	//GETSET方法
	public int getIsSmoking() {
		return isSmoking;
	}
	public void setIsSmoking(int isSmoking) {
		this.isSmoking = isSmoking;
	}
	//方法
	public void smokeWeed() {
		System.out.println("CCC");
	}
	
}
