package com.lijen.method;

/*
 * 方法的重載(overload)
 * 
 * 1.定義:在同一個類中,允許存在一個以上同名的方法,只要他們的型參數量不同或型參類型不同即可。
 * 		"兩同一不同":同一個類,相同方法名。
 * 				  型參列表不同
 * 
 * 2.例如:Array中有多個同樣叫sort的方法,但他們的型參類型各不相同,有int、double等等...型別。
 * 	
 * 3.判斷是否重載:
 * 	跟方法權限修飾符、返回值類型、型參變數名、方法體都沒有關係。
 * 
 * 4.在通過物件調用方法時,如何確定某一個方法:
 * 		方法名 ---> 型參列表
 * 
 */

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class OverLoadTest{
	public void getSum(int i,int j) {
		System.out.println(i+j);
	}
	//上下就是一個重載的範例
	public void getSum(double i,double j) {
		System.out.println(i+j);
	}
	

}
