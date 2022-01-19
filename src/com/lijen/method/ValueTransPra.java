package com.lijen.method;

/*
 * 定義一個Circle類,包含一個double型的radius屬性代表圓的半徑,
 * 一個findArea()方法返回圓的面積
 * 
 * 定義一個PassObject類,包含一個printAreas方法,聲明一個Circle類與int型參
 * 
 * 在main方法中調用printAreas。
 * 
 */

public class ValueTransPra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassObject ob = new PassObject();
		Circle c = new Circle();
		
		ob.printAreas(c, 6);

	}

}

class PassObject{
	public void printAreas(Circle c,int time) {
		System.out.println("Radius" + "\t\t" + "Area");
		
		for(int i = 1;i <= time;i++) {
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		
		System.out.println("現在半徑為: " + c.radius);
	}
}

class Circle{
	double radius;
	
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
}
