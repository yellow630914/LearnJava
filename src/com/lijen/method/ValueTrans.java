package com.lijen.method;

/*
 * 1.型參:方法定義時,聲明小括號的參數。
 * 	 實參:方法調用時,實際傳遞給型參的值。
 * 
 * 2.值傳遞機制:
 *   	如果參數是基本資料型別,此時實參給型參的是,實參真實存儲的值。
 *   	如果參數是引用數據型別,此時實參給型參的是,實參的地址值。
 * 
 */

public class ValueTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("使用基礎型別:");
		
		int m = 10;
		int n = 20;
		
		System.out.println("m = " + m + ",n = " + n);
		
		//在這裡因為傳入的是基礎資料型別,所以在swap方法中運作的是10跟20,而非m跟n。
		new ValueTrans().swap(m, n);
		
		System.out.println("m = " + m + ",n = " + n);
		
		System.out.println("使用class引用:");
		
		//宣告一個Data類
		Data d = new Data();
		d.m = 10;
		d.n = 20;
		
		System.out.println("d.m = " + d.m + ",d.n = " + d.n);
		
		//實參是引用類型,所以傳入的是地址值,在swap中運作的是前面所宣告的d,而不是單純的值。
		new ValueTrans().swap(d);
		
		System.out.println("d.m = " + d.m + ",d.n = " + d.n);
		
		
	}
	public void swap(int x,int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}

}

class Data{
	int m;
	int n;
}
