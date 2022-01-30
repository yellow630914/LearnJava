package com.lijen.object_oriented_0130;

/*
 * static關鍵字的使用
 * 
 * 1.static:靜態的
 * 2.static可以用來修飾:屬性、方法、代碼塊、內部類
 * 
 * 3.使用static來修飾屬性:靜態變數
 * 		(1)屬性:按是否使用static修飾,又分為:靜態屬性 vs 非靜態屬性(實例變數)
 * 			實例變數:我們創建了類的多個物件,每個物件都獨立的擁有一套類中的非靜態屬性。當修改一個物件的屬性中的非靜態屬性時,不會修改其他物件的。
 * 			靜態屬性:我們創建的多個物件,多個物件都共用一個靜態變數。當通過某一個物件修改了靜態變數時,其他的物件也會被修改。
 * 		(2)其他說明:
 * 			-靜態變數隨著類的加載而加載。
 * 			-靜態變數的加載要早於物件的創建。
 * 			-由於類只會加載一次,靜態變數只會在內存中存在一份:存在方法區的靜態域中。
 * 
 * 4.使用static來修飾方法:
 * 		(1)隨著類的加載而加載,所以可以隨著類去調用。
 * 		(2)靜態方法中,只能調用靜態的方法與屬性。
 * 		   非靜態的方法中,兩者皆可調用。
 * 		(3)靜態方法中無法使用this關鍵字,super關鍵字。
 * 
 * 5.開發中,如何確定一個屬性是否要聲明為static?
 * 		-屬性可以被多個物件共享,不會隨著物件不同而不同的。
 * 
 * 	 開發中,如何確定一個方法是否要聲明為static?
 * 		-操作靜態屬性的方法,通常設為靜態。
 * 		-工具類中的方法,習慣上聲名為static的。比如:Math、Array、Collections
 */


public class StaticIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		American.country = "Ame";
		
		American a1 = new American();
		a1.name = "JJAbraham";
		a1.age = 45;
		a1.show();
		
		American a2 = new American();
		a2.name = "Martin";
		a2.age = 35;
		a2.country = "Russian";
		a2.show();
		a1.show();
		
		American.who();
	}

}

class American {
	String name;
	int age;
	static String country = "American";
	
	public void show() {
		System.out.println("姓名:" + name + ", 年齡:" + age + ", 國籍:" + country);
		who();
	}
	
	public static void who() {
		System.out.println("I'm from " + country);
	}
}
