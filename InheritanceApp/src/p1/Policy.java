package p1;

public class Policy {
	
	private int startDate;
	private int endDate;
	private String policyName;
	private int premiumAmount;
	private int sumInsured;
	
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(int startDate, int endDate, String policyName, int premiumAmount, int sumInsured) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.policyName = policyName;
		this.premiumAmount = premiumAmount;
		this.sumInsured = sumInsured;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public int getEndDate() {
		return endDate;
	}
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public int getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}
	
	@Override
	public String toString() {
		return "Policy [startDate=" + startDate + ", endDate=" + endDate + ", policyName=" + policyName
				+ ", premiumAmount=" + premiumAmount + ", sumInsured=" + sumInsured + "]";
	}
	
	
	

}
