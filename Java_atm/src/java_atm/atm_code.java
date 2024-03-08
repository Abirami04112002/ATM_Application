package java_atm;

import java.util.*;
 public class atm_code  
{  
    //main method starts   
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int Balance = 1000000, Withdraw, Deposit;  
          
        try (//create scanner class object to get choice of user  
		Scanner sc = new Scanner(System.in)) {
			while(true)  
			{  
			    System.out.println("Automated Teller Machine");  
			    System.out.println("Select 1 for Withdrawal");  
			    System.out.println("Select 2 for Deposit");  
			    System.out.println("Select 3 for Checking Balance");  
			    System.out.println("Select 4 for EXIT");  
			    System.out.print("Choose the operation to perform:");  
			      
			    //get input from user  
			    int choice = sc.nextInt();  
			    switch(choice)  
			    {  
			        case 1: 
			{ 
			          System.out.print("Enter money to be withdrawn:");  
			              
			          //get the withdrawal money from user  
			          Withdraw = sc.nextInt();  
			              
			          //check whether the balance is greater than or equal to the withdrawal amount  
			          if(Balance >= Withdraw)  
				    {  
			              //remove the withdrawal amount from the total balance  
			              Balance = Balance - Withdraw;  
			              System.out.println("Please collect your money");  
				    }
  
			           else  
				    {  
			             //show custom error message   
			             System.out.println("Sorry!We Couldn't Process because of Insufficient Balance");  
			            }  
			           System.out.println("");  
			           break;  
			}
   
			        case 2:  
			{
			              
				System.out.print("Enter money to be deposited:");  
			              
				//get deposit amount from the user  
				Deposit = sc.nextInt();
			if(Deposit<=0)
			{
			  System.out.println("Sorry!! Error Occured");
			}  
			        else
			{      
				//add the deposit amount to the total balance  
				Balance = Balance + Deposit;  
				System.out.println("Your Money has been successfully depsited");  
				System.out.println("");  
				break;
			}  
			}
   
			        case 3:
			{  
			        //displaying the total balance of the user  
			        System.out.println("Balance : "+Balance);  
			        System.out.println("");  
			        break;  
			}
			        case 4: 
			{ 
			        //exit from the menu  
			        System.exit(0);  
			        }  
			    }  
			}
		}  
     } 
}
