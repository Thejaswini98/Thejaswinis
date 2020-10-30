/**
 * 
 * @author Thejaswini S
 * Desc : This class creates account and ensures minimum balance
 *
 */
public class Account {
	/*
	 * setting attributes of account class
	 */
	private long accNum;
	private double balance;
	private Person accHolder;
	static int count=0;  //static is used because it is a constant
	
	/*
	 * Setter method
	 * @param taking balance to set
	 */
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	/*
	 * getter method
	 */
	public double getBalance()
	{
		return balance;
	}
	public Account(double balance,Person accHolder)
	{
		/**
		 * method to ensure minimum balance of 500 in the account
		 */
		this.balance=balance;
		this.accHolder=accHolder;
		Account.count+=1;
		this.accNum=Account.count;
	}
	/**
	 * to deposit amount in the account
	 * @param amount to be deposited
	 */
	public void deposit(double amount)
	{
		/**
		 * depositing the amount
		 */
		double newAmount = this.getBalance()+amount;     //Add amount to current balance
		this.setBalance(newAmount);                      //Now this amount is new balance
		
	}
	/**
	 *  to withdraw the amount from account
	 *  @param amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		double newAmount = this.getBalance()-amount;     //subtract when withdraw from current balance
		this.setBalance(newAmount);                      //Now this amount is new balance
	}	

}
