package com.lijen.object_oriented_0114;

public class Order {
	public int orderPublic;
	int order;
	private int orderPrivate;
	
	private void methodPrivate() {
		orderPrivate = 1;
		order = 1;
		orderPublic = 1;
	}
	
	void methodDefault() {
		orderPrivate = 1;
		order = 1;
		orderPublic = 1;
	}
	
	public void methodPublic(){
		orderPrivate = 1;
		order = 1;
		orderPublic = 1;
	}
	
}
