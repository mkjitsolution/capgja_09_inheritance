package p1;

import java.util.Arrays;

public abstract class Account {
	
	private String accountHolderName;
	private int accountNumber;
	private int balance;
	private Policy policies[]; // collections
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// optional constructor
	public Account(String accountHolderName, int accountNumber, int balance, Policy[] policies) {
		
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.policies = policies;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		this.balance = balance;
	}

	public Policy[] getPolicies() {
		return policies;
	}

	public void setPolicies(Policy[] policies) {
		this.policies = policies;
	}

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", policies=" + Arrays.toString(policies) + "]";
	}
	
	
	public abstract int withdrawl(int amount);
	
	public abstract int deposit(int amount);
	
	
	

}//end class
