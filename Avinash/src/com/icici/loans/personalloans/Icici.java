package com.icici.loans.personalloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		Icici obj= new Icici();
		obj.deposit();
		obj.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println(" I M Withdraw monry");
		
	}

	@Override
	public void deposit() {
		System.out.println(" I M deposit a money");
	}

}

