package com.lijen.object_oriented_0203;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * 方式一:throws + 異常類型
 * 
 *  1."throws + 異常類型"寫在方法的聲明處。指名此方法執行時,可能會拋出的異常類型。
 *  	一旦當方法體執行時,出現異常能會在異常處生成一個異常類的物件,此物件滿足throws異常類型後就會拋出。
 *  
 *  2.體會:try-catch-finally:真正將異常處理了。
 *  	  throws只是將方法拋給方法調用者,沒有將異常處理掉。
 *  
 *  3.開發中,如何選擇使用try-catch-finally還是throws?
 *  	(1)如果父類中被重寫的方法沒有throws方式處理異常,則子類重寫的方法也不能使用throws,要使用try-catch-finally方式處理。
 *  	(2)執行的方法a中,先後又調用了另外的幾個方法,這幾個方法是遞進關係。
 *  	   我們建議這幾個方法使用throws進行處理,而方法a可以考慮用try-catch-finally進行處理。
 * 
 */

public class ThrowsIntro {
	public static void main(String[] args) {
		try {
			readHelloTest();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void readHelloTest() throws IOException{
		readHello();
	}
	public static void readHello() throws FileNotFoundException,IOException{
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1) {
			System.out.println((char)data);
			data = fis.read();
		}
		
		fis.close();
	}
}
