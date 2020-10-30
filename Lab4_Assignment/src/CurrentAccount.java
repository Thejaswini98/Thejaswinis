/**
 * 
 * @author Thejaswini S
 * Desc: Current accountchecks whether overdraft limit is reached and returns a Boolean value accordingly
 *
 */
public class CurrentAccount extends Account
{
	/**
	 * variable called overDraftLimit
	 */
	private double overDraftLimit;
	/**
	 * constructer of the CurrentAccount class
	 * @param balance
	 * @param accHolder
	 */

	public CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
	}
	/**
	 * overriding withdraw method to check whether overdraftlimit is reached
	 * @param amount
	 */
	@Override
	public void withdraw(double amount)
	{
		double newAmount = super.getBalance()-amount;     //deduct amount from balance
		if(newAmount<=overDraftLimit)
		{
			this.setBalance(newAmount);
		}
		else
		{
			System.out.println("Cannot withdraw as over draft limit reached");
		}
		
	}
}
