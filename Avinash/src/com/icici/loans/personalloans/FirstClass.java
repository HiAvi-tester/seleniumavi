package com.icici.loans.personalloans;

public class FirstClass {

	
	int a=18,  b=56,c;
	
	public void add()
	{
		  c=a+b;
		System.out.println("Addition of a&b :"+ c);
	}
	
	public void sub()
	{
		 c=a-b;
		System.out.println("Subtraction of a & b :"+ c);
	}
	public static void main(String[] args) 
	{
		System.out.println("hi");
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();

	}

}

