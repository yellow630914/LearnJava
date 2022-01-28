package com.lijen.object_oriented_0125;

import org.junit.Test;
/*
 * Java中的JUnit單元測試
 * 
 * 步驟:
 * 1.選中當前工程 - 右鍵選擇:build path - add library - JUnit 4 -下一步
 * 2.創建Java,進行單元測試。
 * 	 此時Java類的要求:(1)此類是public的(2)此類提供公共的無參的構造器
 * 3.此類的單元測試方法。
 * 	 此時的單元測試方法:方法的權限是public,沒有返回值,沒有型參。
 * 4.此單元測試方法上需要聲明註釋:@Test,並在單元測試類中導入: import org.junit.Test
 * 5.聲明好單元測試方法以後,就可以在方法體內測試相關代碼
 * 6.寫完代碼以後,左鍵雙擊測試方法名,右鍵:run as - JUnit Test
 * 
 * 說明:
 * 1.如果執行結果沒有任何異常:綠條
 * 2.如果執行結果出現異常:紅條
 */

public class JUnitTest {
	
	int num = 10;
	
	@Test
	public void testEqauls() {
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		
		
	}

}
