package com.lijen.object_oriented_0203;

import org.junit.Test;

/*
 * 方式一:try-catch-finally
 * 			try{
 * 				//可能出現異常的代碼
 * 			}catch(異常處理1 變數名1){
 * 				//處理方式1
 * 			}catch(異常處理2 變數名2){
 * 				//處理方式2
 * 			}catch(異常處理3 變數名3){
 * 				//處理方式3
 * 			}...finally{
 * 				//一定會執行的代碼
 * 			}
 * 	說明:
 * 	1.使用try將可能出現異常的代碼包起來,在執行過程中,一旦出現異常,就會升成一個對異常的物件,根據次物件類型,
 * 	  去匹配catch。
 * 	2.一旦try中的異常匹配到某一個catch時,就進入catch中進行異常處理。一旦處理完成,就跳出當前try-catch(在沒有finally的情況下)
 * 	3.catch中的異常類型若有父子關係,父類的catch應該要放在子類的catch前面,否則報錯。
 * 	4.常用的異常處理對象處理的方式:(1)String getMessage() (2)printStackTrace()
 * 	5.在try結構中盛名的變數,在出了try之後不能在外部使用。
 * 	6.try-catch-finally可以嵌套。
 * 	7.finally是可選的。
 * 	8.finally中聲明的是一定會被執行的代碼,不論try中是否出現異常,即使在return之前也會執行finally中的代碼。
 * 	9.finally通常會用於數據庫連接、輸入輸出流、網路編程socket等資源的釋放。
 * 
 * 體會一:使用try-catch-finally處理編譯時異常,使得程序在編譯時不在報錯,但在運行時扔可能報錯。
 * 		相當於我們使用try-catch-finally將一個編譯時可能出現的異常,推遲到運行時。
 * 體會二:開發中,由於運行時異常比較常見,所以我們通常不針對運行時異常編寫try-catch-finally。
 * 		針對編譯時異常,我們一定要考慮try-catch異常處理。
 * 
 */
public class TryCatchFinallyIntro {

	@Test
	public void test1() {
		String str = "123";
		str = "abc";
//		try-catch-finally
		try {
			int num = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			System.out.println("數值轉換異常");
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("空指針異常");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("出現異常");
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void test2() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("這是Finally");
		}
	}

	
	
}
