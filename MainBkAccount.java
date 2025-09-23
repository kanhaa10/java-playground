/*A bank wants to maintain customer accounts. The system should allow:

Creating an account (with name, account number, and balance).

Depositing money.

Withdrawing money (only if sufficient balance).

Displaying account details.

We’ll apply:

Encapsulation → make fields private, use getters/setters.

Constructor → to initialize account.

Methods → deposit, withdraw, display.*/


class BkAccount
{
	private String name;
	private int accountNumber;
	private double balance;
	
	BkAccount(String name,int accountNumber,double balance)
	{
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	
	void depositMoney(double amount)
	{
		balance += amount;
				
	}
	
	
	void withdrawMoney(double amount)
	{
		while(amount > 0)
		{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.print(balance);
		}
		else 
		{
			System.out.println("insufficent balance");
		}
		}
	}
	
	void display()
	{
		System.out.println("User name " + name);
		System.out.println("Account number " + accountNumber);
		System.out.println("Balance "+ balance);
	}
	
	
}

public class MainBkAccount
{
	public static void main(String [] args)
	{
		BkAccount ba=new BkAccount("Aayush" , 1234567 , 10000);
		ba.depositMoney(2000);
		ba.withdrawMoney(0);
		ba.display();
	}
}