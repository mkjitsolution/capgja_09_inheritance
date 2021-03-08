package p1;

public class SavingAccount extends Account{

	private int minBalance;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
		this.minBalance = 5000;
	}

	public SavingAccount(String accountHolderName, int accountNumber, int balance, Policy[] policies) {
		super(accountHolderName, accountNumber, balance, policies);
		this.minBalance = 5000;
	}


	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [minBalance=" + minBalance + "]";
	}

	@Override
	public int withdrawl(int amount) {
		
		int newBalance = -1; // default value
		if(super.getBalance()>minBalance)
		{
			newBalance = super.getBalance() - amount;
			if(newBalance<minBalance)
			{
				System.out.println(" Cannot Withdraw the amount");
			}
			else
			{
				super.setBalance(newBalance);
				System.out.println("New Balance "+newBalance);
			}
		}
		else
		{
			System.out.println(" Cannot Withdraw the amount");
		}
		
		return newBalance;
		
	}

	@Override
	public int deposit(int amount) {
		
		int newBalance = super.getBalance()+amount;
		 super.setBalance(newBalance);
		
		return newBalance;
	}
	
	 
	
}
