package com.lijen.method;
/*
 * 遞歸方法的使用
 * 1.遞歸方法:一個方法調用它自身。
 * 2.方法遞歸班含一種隱式的循環,它會重複執行一段代碼,但不依靠for或while等等語法。
 * 
 * 
 * 
 */
public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new RecursionTest().getSum(20));
		
	}
	//取得1-n之間所有數的和
	public int getSum(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n + getSum(n - 1);
		}
	}

}
