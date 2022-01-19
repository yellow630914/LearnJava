package com.lijen.object_oriented_0114;

public class ConstructorsWithTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri1 = new Triangle();
		tri1.setBase(2.0);
		tri1.setHeight(1.5);
		System.out.println("base = " + tri1.getBase() + ",height = " + tri1.getHeight());
		
		Triangle tri2 = new Triangle(5.1,2.5);
		System.out.println("base = " + tri2.getBase() + ",height = " + tri2.getHeight());
		
	}

}

class Triangle{
	//屬性
	private double base;
	private double height;
	//構造器
	public Triangle(){
		
	}
	public Triangle(double base,double height){
		this.base = base;
		this.height = height;
	}
	
	//方法
	public void setBase(double b) {
		base = b;
	}
	public double getBase() {
		return base;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	public double getHeight() {
		return height;
	}
}
