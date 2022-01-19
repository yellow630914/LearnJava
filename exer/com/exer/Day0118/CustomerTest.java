package com.exer.Day0118;

public class CustomerTest {
	public static void main(String[] args) {
		//湯姆克蘭西成為客戶
		Customer cust1 = new Customer("Tom","Clancy");
		//新創一個帳戶
		Account acct = new Account(10000, 2000, 0.0123);
		//帳戶連結到湯姆克蘭西
		cust1.setAccount(acct);
		
		//湯姆克蘭西存了2000
		cust1.getAccount().withdraw(2000);
	}

}
