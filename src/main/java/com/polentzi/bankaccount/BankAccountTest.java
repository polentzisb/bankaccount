package com.polentzi.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		
	BankAccount user1 = new BankAccount();
	BankAccount user2 = new BankAccount();
	BankAccount user3 = new BankAccount();
	user1.accountDeposit("Savings", 20.00);
	user2.accountDeposit("checking", 250.00);
	user3.accountDeposit("savings", 15000.50);
	user1.accountWithdrawal("Checking", 50.00);
	user2.accountWithdrawal("checking", 100.00);
	user3.accountWithdrawal("savings", 3000.00);
	user2.myBalance();
	user1.myBalance();
	user3.myBalance();
	}
}