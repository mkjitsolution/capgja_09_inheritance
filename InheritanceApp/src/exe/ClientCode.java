package exe;

import p1.Account;
import p1.SavingAccount;

public class ClientCode {
	
	public static void main(String[] args) {
	
		ClientCode bankAppUser = new ClientCode();
		
		// valid = true;
		
		SavingAccount sa1 = new SavingAccount("Ramesh",101, 7000, null);
		
		bankAppUser.doDepositOperation(sa1, 10000);
		bankAppUser.doWithdrawalOperation(sa1, 4500);
		
		
	}
	
	public void doWithdrawalOperation(Account a,int amount)
	{
		int balance = a.withdrawl(amount);
		System.out.println(" User "+a.getAccountHolderName());
		System.out.println(" Balance "+a.getBalance());
		System.out.println(" Deposited "+amount);
	}
	
	public void doDepositOperation(Account a,int amount)
	{
		int balance = a.deposit(amount);
		System.out.println(" User "+a.getAccountHolderName());
		System.out.println(" Balance "+a.getBalance());
		System.out.println(" Deposited "+amount);
		
	}

}
