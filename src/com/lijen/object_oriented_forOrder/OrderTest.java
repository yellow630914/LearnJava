package com.lijen.object_oriented_forOrder;

import com.lijen.object_oriented_0114.Order;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.orderPublic = 1;
//		以下2屬性因為出了Order類所在的包了,所以無法調用。
//		order.order = 2;
//		order.private = 3;
	}

}
