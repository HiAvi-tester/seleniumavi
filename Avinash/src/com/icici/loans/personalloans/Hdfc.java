package com.icici.loans.personalloans;

public class Hdfc implements Rbi {

	public static void main(String[] args) {
		Hdfc obj = new Hdfc();
		obj.deposit();
		obj.withdrawl();
}

	@Override
	public void withdrawl() {
		System.out.println(" I am withdraw a Money");
	}

	@Override
	public void deposit() {
		System.out.println(" I am deposit a Money");
		
	}
}
