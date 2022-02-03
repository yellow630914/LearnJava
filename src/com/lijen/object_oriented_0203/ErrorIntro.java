package com.lijen.object_oriented_0203;
/*
 * Java虛擬機無法解決的嚴重問題。如:JVM系統內部錯誤、資源耗盡等嚴重情況。比如:StackOverFlowError,OutOfMemryError。
 * 
 * 一般不編寫代碼針對處理。
 * 
 */
public class ErrorIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.棧溢出:StackOverFlowError
//		main(args);
		
		//2.堆溢出:OutOfMemryError
		Integer[] arr = new Integer[1024*1024*1024];
	}

}
