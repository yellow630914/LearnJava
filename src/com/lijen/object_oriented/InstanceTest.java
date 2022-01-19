package com.lijen.object_oriented;

public class InstanceTest {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		
		System.out.println(p1);
		
		p1.sendEmail();
		p1.playGame();
		
		//匿名物件
		new Phone().sendEmail();
		new Phone().price = 1999;
		new Phone().showPrice();
		
		
		
	}
	
	
}


class Phone{
	double price;
	
	public void sendEmail() {
		System.out.println("發送文件");
	}
	
	public void playGame() {
		System.out.println("玩個遊戲");
	}
	
	public void showPrice() {
		System.out.println(price);
	}
}