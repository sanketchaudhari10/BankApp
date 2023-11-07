import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import exceptions.InsufficientFundsException;
import model.Account;
import service.AccountService;

public class AccountTest {
	private AccountService ac;
	private Account myAcc;
	private Account otherAcc;
	@BeforeEach
	@Test
	public void setUp() {
		ac = new AccountService();
		myAcc = new Account(1,5000);
		otherAcc = new Account(2,2000);
	}
	@Test
	public void withDrawShouldWithDrawSuccessfullyTest()  {
		float expected = 4000;
		float amount = 1000;		
		float actual=0;
		try {
			actual = ac.withDraw(myAcc,amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		assertEquals(expected,actual);
	}
	
	@Test
	public void withDrawShouldThrowLowBalanceExceptionTest() {
		assertThrows(InsufficientFundsException.class, ()->ac.withDraw(myAcc,6000));
	}
	
	@Test
	public void deposit()
	{
		float expected = 6000;
		float amount = 1000;		
		float actual=ac.deposit(myAcc,amount);
		System.out.println(actual+" "+expected);
		assertEquals(expected,actual);
	}
	
	@Test
	public void transferFund() {
		assertEquals(true, ac.transferFund(myAcc, otherAcc, 1000));
	}
	
	




}
