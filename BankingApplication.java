class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String message)
		{
			super(message);
		}	
}

	class Account
	{
		private double balance;
	

	public Account()
	{
		balance= 0.0;
	}

	public void Deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposited: Rs " +amount);
	}

	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println("Withdrawn : Rs" + amount);	
		}

		else
		{
			throw new InsufficientFundsException("Not Sufficient fund!!!");
		}
	}

	public double CurrentBalance()
	{
		return balance;
	}
	}
	public class BankingApplication
	{
		public static void main(String args[])
		{
			Account myobj = new Account();
			myobj.Deposit(25000);
			
			try
			{
				myobj.withdraw(20000);
				myobj.withdraw(4000);
				myobj.withdraw(2000);

			}

			catch(InsufficientFundsException e)
			{
				System.out.println("Caught an Exception :"+e.getMessage());
			}

			System.out.println("Current Balance is :"+myobj.CurrentBalance());
		}
	}