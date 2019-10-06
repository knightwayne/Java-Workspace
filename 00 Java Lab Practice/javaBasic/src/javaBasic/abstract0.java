package javaBasic;
abstract class Accounts
{
	int balance,accountNumber;
	String accountName;
	Accounts(int bal, int acc, String name)
	{
		balance=bal;
		accountNumber=acc;
		accountName=name;
	}
	abstract void deposit();
	abstract void withdrawl();
	void display()
	{
		
	}
	
}
abstract class SavingAccount extends Accounts
{
	int rateofInterest;
	SavingAccount(int bal, int acc, String name, int roi)
	{
		super(bal, acc, name);
		rateofInterest=roi;
	}
	void calculateAmount()
	{
		
	}
}
abstract class CurrentAccount extends Accounts
{
	int overDraftlimit;
	CurrentAccount(int bal, int acc, String name, int odl)
	{
		super(bal, acc, name);
		overDraftlimit=odl;
	}
	void dislay()
	{
		
	}
	
}
public class abstract0 
{
public static void main(String args[])
{
	
}
}
