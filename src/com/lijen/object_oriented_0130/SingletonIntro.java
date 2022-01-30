package com.lijen.object_oriented_0130;

/*
 * 單例設計模式:
 * 	保證一個類在一個軟體系統中,只能存在一個物件的設計模式,並且該類只提供一個獲取該物件實例的方法。
 * 		餓漢式:
 * 			1.首先先把該類的構造器設為private,這樣就確保不會在外部被new。
 * 			2.在內部創建唯一一個類的物件,並以private與static修飾。
 * 			3.提供一個公有的方法讓外部取得此唯一的物件,必須使用static修飾,讓外部可直接通過類來取得單例物件。
 * 		懶漢式:
 * 			1.首先先把該類的構造器設為private,這樣就確保不會在外部被new。
 * 			2.在內部聲明一個類的物件,但先不不賦值,並以private與static修飾。
 * 			3.提供一個公有的方法讓外部取得此唯一的物件,並同時創建物件,並以private與static修飾。
 * 		兩者差別:
 * 			餓漢式:
 * 				好處:線程安全。
 * 				壞處:加載時間過長。
 * 			懶漢式:
 * 				好處:延遲物件創建,節省內存。
 * 				壞處:線程不安全。
 */

public class SingletonIntro {
	public static void main(String[] args) {

		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		
		System.out.println(bank1 == bank2);
	}
}


//餓漢式單例模式
class Bank{
	
	//1.私有化類的構造器
	private Bank(){
		
	}
	
	//2.內部創建類的物件
	private static Bank instance = new Bank();
	
	//3.提供公共的方法,返回類的對象。
	public static Bank getInstance() {
		return instance;
	} 
}


//懶漢式單例模式
class Order{
	
	//1.私有化類的構造器
	private Order(){
			
	}
	
	//2.聲明當前類的物件,但沒有初始化。
	private static Order instance = null;
	
	//3.提供公共的方法,返回類的對象。
	public static Order getInstance() {
		if(instance == null) {
			instance = new Order();
			return instance;
		}else {
			return instance;
		}
	} 
}