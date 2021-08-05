package common.pojo;

import java.util.ArrayList;

public class Client {
	protected String name;
	protected String pass;
	private int id;
	private ArrayList<Account> userAccounts = new ArrayList<Account>();
	
	
	public Client(String name, String pass) {
		this.name = name;
		this.pass = pass;		
	}
	
	public Client(String name) {
		this.name = name;
	}
	
	public Client(String[] credentials) {
		this.name = credentials[0];
		this.pass = credentials[1];
	}
	
	
	public String getname() {
		return this.name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getpass() {
		return this.pass;
	}
	
	public void setpass(String pass) {
		this.pass = pass;
	}

	public ArrayList<Account> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(ArrayList<Account> userAccounts) {
		this.userAccounts = userAccounts;
	}
	
	public Account createAccount(Client client, String nickname) {
		int j = this.id;
		Account newAcc = new Account(j,nickname);
		return newAcc;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}