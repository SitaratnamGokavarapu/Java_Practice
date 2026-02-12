package com.javaintro;

public class Bank {
	
	static int account_no = 12031;
	
	String account_holder_name;
	double balance;
	void display() {
		{
			account_no = account_no+1;
		}
		System.out.println(account_no);
		System.out.println("Balance =" + balance);
		System.out.println("Balance Displayed!!!");
		
	}

	public static void main(String[] args) {
		Bank b=new Bank();
		//Bank b1 = new Bank();
		System.out.println(account_no);
		System.out.println(b.account_holder_name);
		System.out.println(b.balance);
		b.display();
		
	}
	

}
