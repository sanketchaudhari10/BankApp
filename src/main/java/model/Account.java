package model;
import exceptions.InsufficientFundsException;

public class Account {
	private float balance;
	private int accountId;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Account( int accountId, float balance) {
		super();
		this.balance = balance;
		this.accountId = accountId;
	}

	
	
	
}
