package com.lijen.object_oriented_subOrder;

import com.lijen.object_oriented_forOrder.Order;

public class subOrder extends Order {
	public void method() {
		//不同包下調用父類的Protected修飾屬性。
		orderProtected = 1;
		orderPublic = 2;
		
		//不同包下調用父類的Protected修飾方法。
		methodProtected();
		methodPublic();
		
//		不同包下無法調用
//		orderDefault = 3;
//		orderPrivate = 4;
	}
}
