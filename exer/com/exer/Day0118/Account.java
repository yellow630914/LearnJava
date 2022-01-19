package com.exer.Day0118;

public class Account {
	//屬性
	private int id; //用戶碼
	private double balance; //餘額
	private double annualInterresrRate; //利率
	
	//構造器
	public Account(int id, double balance, double annualInterresrRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterresrRate = annualInterresrRate;
	}

	//get,set方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterresrRate() {
		return annualInterresrRate;
	}
	public void setAnnualInterresrRate(double annualInterresrRate) {
		this.annualInterresrRate = annualInterresrRate;
	}
	
	//取款方法
	public void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("餘額不足。");
			return;
		}
		balance -= amount;
		System.out.println("成功取出:" + amount);
	}
	//存款方法
	public void deposit(double amount) {
		if(amount > 0) {
			System.out.println("成功存入:" + amount);
		}
	}
	
	
	
	
}
