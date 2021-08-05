package common.pojo;

public class Transfer {
	Client sender;
	Client recipient;
	Account senderAcc;
	Account recipientAcc;
	double amount;
	int transid;
	
	boolean isAccepted = false;
	
	public int gettransid() {
		return transid;
	}

	public void settransid(int transid) {
		this.transid = transid;
	}

	public Transfer(Account sender, Account recipient, double amount) {
		this.senderAcc = sender;
		this.recipientAcc = recipient;
		this.amount = amount;
	}

	public Client getSender() {
		return this.sender;
	}
	
	public boolean isAccepted() {
		return isAccepted;
	}

	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	public void setSender(Client sender) {
		this.sender = sender;
	}

	public Client getRecipient() {
		return this.recipient;
	}

	public void setRecipient(Client recipient) {
		this.recipient = recipient;
	}
	
	public Account getSenderAcc() {
		return this.senderAcc;
	}

	public void setSenderAcc(Account sender) {
		this.senderAcc = sender;
	}

	public Account getRecipientAcc() {
		return this.recipientAcc;
	}

	public void setRecipientAcc(Account recipient) {
		this.recipientAcc = recipient;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getSenderAccId() {
		double i = this.senderAcc.getId();
		return i;
	}
	
	public double getRecipientAccId() {
		double i = this.recipientAcc.getId();
		return i;
	}
	
	public double getSenderId() {
		return this.senderAcc.getId();
	}
	
	public double getRecipientId() {
		return this.recipientAcc.getId();
	}
}