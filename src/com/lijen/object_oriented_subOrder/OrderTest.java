package com.lijen.object_oriented_subOrder;

import com.lijen.object_oriented_forOrder.Order;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.orderPublic = 1;
//		以下3屬性因為出了Order類所在的包了,所以無法調用。
//		order.orderProtected = 1;
//		order.order = 2;
//		order.private = 3;
	}

}
