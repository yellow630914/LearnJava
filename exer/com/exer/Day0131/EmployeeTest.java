package com.exer.Day0131;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//多態
		Employee m1 = new Maneger("Tom",1001,5000,60000);
		
		m1.work();
		
		Employee c1 = new CommonEmployee();
		c1.work();
	}

}
