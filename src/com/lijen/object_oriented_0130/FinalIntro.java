package com.lijen.object_oriented_0130;

/*
 * final:最終的
 * 
 * 1.final可以用來修飾結構:類、方法、變數。
 * 2.final用來修飾一個類:
 * 		-不能被繼承的
 * 		-比如String、System、StringBuffer
 * 
 * 3.final用來修飾方法:
 * 		-不能被重寫
 * 		-比如:Object.getClass();
 * 
 * 4.final修飾屬性:
 * 		-此時這個變數會變成常量,無法被改變。
 * 		-可以考慮賦值的地方有:顯示初始化、代碼塊初始化、構造器初始化。
 * 
 * 5.final修飾局部變數:
 * 		-此時這個局部變數會變成常量,無法被改變。
 * 		-尤其使用在形參時,表明此形參是一個常量。調用此方法時,給形參賦一個實參,一旦賦值以後,就無法在進行賦值。
 * 
 * static final :用來修飾一個當類被加載時,就不會再變的。
 * 		屬性:全局常量。
 * 
 * 
 */

public class FinalIntro {
	public static void main(String[] args) {
		
	}
}

final class FinalA{
	
}
