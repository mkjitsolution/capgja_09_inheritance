package p1;

public class CurrentAccount extends Account{
	
	private String companyName;
	private int minBalance = -20000;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountHolderName, int accountNumber, int balance, Policy[] policies,String companyName) {
		super(accountHolderName, accountNumber, balance, policies);
		
		this.companyName = companyName;
	}
	
	
	
	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

	@Override
	public String toString() {
		return "CurrentAccount [companyName=" + companyName + ", minBalance=" + minBalance + "]";
	}

	@Override
	public int withdrawl(int amount) {
		
		int newBalance = -1; // default value
		if(super.getBalance()>-minBalance)
		{
			newBalance = super.getBalance() - amount;
			super.setBalance(newBalance);
			System.out.println("New Balance "+newBalance);
			
		}
		else
		{
			System.out.println(" Cannot Withdraw the amount");
		}
		
		return newBalance;
	}

	@Override
	public int deposit(int amount) {
		
		boolean isValidGSTTransaction = true; // different code to get status
		int newBalance = 0;
		
		if(isValidGSTTransaction)
		{
			newBalance = super.getBalance()+amount;
			super.setBalance(newBalance);
		}
		else
		{
			System.out.println(" Transaction Failed");
		}
		
		return newBalance;
	}


	
	
	
	

}
