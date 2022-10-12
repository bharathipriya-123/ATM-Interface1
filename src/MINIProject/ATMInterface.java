package MINIProject;

import java.util.Scanner;

public class ATMInterface {
	public static void main(String[] args)
	{
		int balance=100000,withdraw ,deposit;
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("****welcome to ATM Interface****");
			System.out.println("choose 1 for Withdraw");
			System.out.println("choose 2 for Deposit");
			System.out.println("choose 3 for Check Balance");
			System.out.println("choose 4 for EXIT");
			System.out.println("choose the opertion you want to do");
			int choice = sc.nextInt();
			switch(choice)
			{
			    case 1:
				System.out.println("Enter money to be withdraw");
				withdraw = sc.nextInt();
			
			if (balance >= withdraw)
			{
				balance = balance - withdraw;
				System.out.println("please collect your money");
				
			}
			else 
			{
				System.out.println("Insufficient Balance");
			}
			System.out.println(" ");
			break;
		    case 2:
			
		        System.out.println("Enter money to be deposited :");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println(" Your money has been successfully deposited");
				System.out.println(" ");
				break;
				
		    case 3:
			    System.out.println("Balance : " + balance);
				System.out.println(" ");
				break;
				
			    case 4:
			    	
				System.exit(0);
			
		}
	}
}
}

