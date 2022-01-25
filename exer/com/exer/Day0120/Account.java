package com.exer.Day0120;

public class Account {
	//屬性
	private int id;
	private double balance;
	private double annualInterestRate;
	//構造器
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	//SetGet方法
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
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//方法
	public double getMonthlyInterest() {
		return annualInterestRate/12;
	}
	public void withdraw (double amount) {
		if(balance >= amount) {
			balance -= amount;
			return;
		}
		System.out.println("餘額不足");
	}
	public void deposit (double amount) {
		if(amount > 0) {
			balance += amount;
			return;
		}
	}
	
}
