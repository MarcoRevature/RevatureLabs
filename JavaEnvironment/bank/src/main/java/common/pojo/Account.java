package common.pojo;

public class Account {
	private boolean isApproved;
	private double balance;
	private String accName;
	private int accOwner;
	private double id;
	
	public Account(int userid, String accName) {
		this.accOwner = userid;
		this.accName = accName;
		this.balance = 0;
		this.isApproved = false;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isApproved() {
		return isApproved;
	}
	
	public void setApproved(boolean isApproved) {
		// if(current user is Admin)
		this.isApproved = isApproved;
	}

	public String getActName() {
		return accName;
	}

	public void setActName(String actName) {
		this.accName = actName;
	}

	public int getaccOwner() {
		return accOwner;
	}

	public void setaccOwner(int accOwner) {
		this.accOwner = accOwner;
	}
	
	public void actionDeposit(int amount) {
		this.balance = this.balance + amount;
	}
	
	public void actionWithdrawl(int amount) {
		this.balance = this.balance - amount;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String toString() {
		return "accountName: " + this.getActName() + " isApproved: " + this.isApproved();
	}
	
}