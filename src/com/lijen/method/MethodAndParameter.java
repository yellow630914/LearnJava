package com.lijen.method;

/*
 * 如果變數是基礎資料型別，他儲存的是值。
 * 如果變數是引用資料型別，他儲存的是地址值。
 */

public class MethodAndParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-------------------------------------------------
		//基礎數據類型
		int m = 10;
		//因為m與n都是基礎數據類型,所以n取得的是一個值。
		int n = m;
		
		System.out.println("m = " + m + ", n = " + n);
		
		n = 20;
		
		System.out.println("m = " + m + ", n = " + n);
		//-------------------------------------------------
		//引用數據類型
		Order o1 = new Order();
		o1.ID = 1001;
		
		//這裡是直接複製o1的地址值,皆指向同一個堆空間實體。
		Order o2 = o1;
		
		System.out.println("o1 = " + o1.ID + ",o2 = " + o2.ID);
		
		//這裡修改了堆空間實體的值，所以同樣指向一個實體的o1也跟著一起變了。
		o2.ID = 1002;
		
		System.out.println("o1 = " + o1.ID + ",o2 = " + o2.ID);
	}

}

class Order{
	int ID;
}
