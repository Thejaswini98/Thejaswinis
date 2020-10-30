/**
 * 
 * @author Thejaswini S
 * Desc: Savings account that allows to withdraw amount while keeping minimum balance
 *
 */
public class SavingsAccount extends Account
{

	/**
	 * final variable that contains minimum balance of 500
	 */
	private final double MIN_BALANCE=500;
	
	/**
	 * constructer class with parameters 
	 * @param balance
	 * @param accHolder
	 */
	public SavingsAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		
	}
	/**
	 * override the withdraw method from account class to ensure minimum balance and then allow withdraw
	 * @param amount
	 */
	@Override
	public void withdraw(double amount)
	{
		double newAmount = super.getBalance()-amount;     //deduct amount from balance
		/**
		 * amount to withdraw should be greater than the minimum balance 
		 */
		if(newAmount>=MIN_BALANCE)
		{
			super.setBalance(newAmount);
		}
		else
		{
			System.out.println("Account does not have minimum balance to withdraw");
		}
		
	}

}
