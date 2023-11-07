package service;

import exceptions.InsufficientFundsException;
import model.Account;
public class AccountService {
//	private Account acc1;
//	private Account acc2;
	public float withDraw(Account ac,float amount) throws Exception{
		if(amount>ac.getBalance()) {
			throw new InsufficientFundsException();
			
		}else {
		ac.setBalance(ac.getBalance()-amount);		
		}
		return ac.getBalance();
	}
	public float deposit(Account ac,float amount) {
		ac.setBalance(ac.getBalance()+amount);
		return ac.getBalance();
	}
	public boolean transferFund(Account debitor, Account creditor,float amount) {
		if(debitor.getBalance()<amount) {
			return false;
		}
		debitor.setBalance(debitor.getBalance()-amount);
		creditor.setBalance(creditor.getBalance()+amount);
	
		return true;
	}
}
