/**
 * 
 * @author Thejaswini S
 * Test running savings and current account checking withdrawal and deposit methods
 *
 */
public class TestAccount
{
	public static void main(String[] args) 
	{
		/**
		 * setting names and age for person Smith with initial balance 2000
		 */
		Person smith=new Person();
		smith.setName("Smith");
		smith.setAge(30);
		Account smithAcc=new Account(2000,smith);
		System.out.println("Initial Balance of smith" +smithAcc.getBalance());
		/**
		 * setting names and age for person Kathy with initial balance 3000
		 */
		Person kathy=new Person();
		kathy.setName("Kathy");
		kathy.setAge(30);
		Account kathyAcc=new Account(3000,smith);
		System.out.println("Initial Balance of kathy "+kathyAcc.getBalance());
		
		/**
		 * deposit 2000 in smith account
		 */
		smithAcc.deposit(2000);
		/**
		 * withdraw 2000 from kathys account
		 */
		kathyAcc.withdraw(2000);
		
		/**
		 * now we display updated balance after withdraw and deposit in accounts
		 */
		
		System.out.println("Updated balance of Smith's account after deposit:" +smithAcc.getBalance());
		System.out.println("Updated balance of kathy's account after withdrawal: " +kathyAcc.getBalance());
		
	}

}
