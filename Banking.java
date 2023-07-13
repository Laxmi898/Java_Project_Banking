package javaMainProject;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 'Name' and 'CustomerId' to access your bank details");
		String name=sc.next();
		String customerId=sc.next();
		BankAccount obj1=new BankAccount(name,customerId);
		obj1.menu();

	}
	

}
class BankAccount
{
	double bal;
	double prevTrans;
	String customerName;
	String customerId;
	
	BankAccount(String customerName,String customerId)
	{
		this.customerName=customerName;
		this.customerId=customerId;
	}
	void deposit(double amount)
	{
		if(amount!=0)
		{
			bal=bal+amount;
			prevTrans=amount;
		}
	}
	void withdraw(double amt)
	{
		if(amt!=0&&bal>=amt)
		{
			bal=bal-amt;
			prevTrans=prevTrans-amt;
		}
		else if(bal<amt)
		{
			System.out.println("bank balance insufficient");
		}
	}
		void getPreviousTrans()
		{
			if(prevTrans>0)
			{
				System.out.println("Deposited"+prevTrans);
			}
			else if(prevTrans<0)
			{
				System.out.println("withdrawn"+Math.abs(prevTrans));
			}
			else
			{
				System.out.println("no transaction occured");
			}
		}
		void SI(double amountt)
		{
			double p,t,r;
			Scanner s=new Scanner(System.in);
			System.out.println("enter time\nenter rate\n");
		t=s.nextDouble();r=s.nextDouble();
			
			
			double sii;
			sii=(amountt*t*r)/100;
			System.out.println("Simple Intrest"+sii);
			
		}
		void menu()
		{
			char option;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Welcome"+customerName);
			System.out.println("You ID"+customerId);
			System.out.println("\n");
			System.out.println("a) Check Balance");
			System.out.println("b) Deposit amount");
			System.out.println("c) WIthdraw amount");
			System.out.println("d) Previous Transaction");
			System.out.println("e) Simple Intrest");
			System.out.println("f) Exit");
			
			do
			{
				System.out.println("*****************************");
				System.out.println("Choose an Option");
				option=sc.next().charAt(0);
				System.out.println("\n");
				switch(option)
				{
				case 'a':
					System.out.println("---------------");
					System.out.println("Balance="+bal);
					System.out.println("---------------");
					System.out.println("\n");
					break;
				case 'b':
					System.out.println("---------------");
					System.out.println("Enter a amount to be deposited");
					System.out.println("---------------");
					double amt=sc.nextDouble();
					deposit(amt);
					System.out.println("The amount deposited is"+amt);
					//System.out.println("the current amount is"+(amt+prevTrans));
					System.out.println("\n");
					break;
				case 'c':
					System.out.println("---------------");
					System.out.println("Enter a amount to Withdraw");
					System.out.println("---------------");
					double amtW=sc.nextDouble();
					withdraw(amtW);
					System.out.println("\n");
					break;
				case 'd':
					System.out.println("---------------");
					System.out.println("Previous Transaction");
					getPreviousTrans();
					System.out.println("---------------");
					System.out.println("\n");
					break;
				case 'e':
					System.out.println("Simple intrest");
					double amountt=sc.nextDouble();
					SI(amountt);
				case 'f':
					System.out.println("---------------");
					break;
					default:
						System.out.println("choose a correct option to proceed");
						break;
				}
			}while(option!='f');
			System.out.println("Thank you for using banking services");
		}
	}
	
	

