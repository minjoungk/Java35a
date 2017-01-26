/*Min Joung Kim
*CIS 35A
*Assignment4-1
*May 9,2016
*May 9,2016*/
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	int option;
	double money;
	char repeat = 'n';
	
	
	//Friendly interface of savingAccount program.
	System.out.println("Welcome to SavingAccount.");

	//get annual interst from an user
	System.out.print("Please enter the annual Interest: ");
	int interest = input.nextInt();
	SavingAccount.modifyMonthlyInterest(interest);
	
	
	//saver1
	System.out.println("\nSaver1's Account: ");
	SpecialAccount saver1 = new SpecialAccount(2000);
	saver1.calculateMonthlyInterest();
	saver1.print();
	
	do{
		//Menu
		System.out.println("\nMenu: ");
		System.out.println("1.Deposit");
		System.out.println("2.Withdrawal");
		System.out.println("Please choose an option from 1 to 2: ");
		option = input.nextInt();
		
		if(option == 1){

			System.out.print("Please enter the amount of deposit money: ");
			money = input.nextDouble();
			saver1.deposit(money);
			saver1.calculateMonthlyInterest();
			saver1.print();
			
			
		}else if(option == 2){
			System.out.print("Please enter the amount of withdrawal money: ");
			money = input.nextDouble();
			saver1.withdrawal(money);
			saver1.calculateMonthlyInterest();
			saver1.print();
		}else{
			
			System.out.print("**Please enter an option between 1 and 2** ");

		}
		
		System.out.print("\nDo you want to either deposit or withdraw again?(y/n): ");
		repeat = input.next().charAt(0);
		
		}while(repeat == 'y'); //while an user assign 'y', it will iterate until an user put 'n'

	System.out.print("Thank you for using our service.");

	

	//saver2
	System.out.println("\nSaver2's Account: ");
	SpecialAccount saver2 = new SpecialAccount(3000);
	saver2.calculateMonthlyInterest();
	saver2.print();
	
	do{
		System.out.println("\nMenu: ");
		System.out.println("1.Deposit");
		System.out.println("2.Withdrawal");
		System.out.println("Please choose an option from 1 to 2: ");
		option = input.nextInt();
		
		if(option == 1){

			System.out.print("Please enter the amount of deposit money: ");
			money = input.nextDouble();
			saver2.deposit(money);
			saver2.calculateMonthlyInterest();
			saver2.print();
			
			
		}else if(option == 2){
			System.out.print("Please enter the amount of withdrawal money: ");
			money = input.nextDouble();
			saver2.withdrawal(money);
			saver2.calculateMonthlyInterest();
			saver2.print();
		}else{
			
			System.out.print("**Please enter an option between 1 and 2** ");

		}
		
		System.out.print("\nDo you want to either deposit or withdraw again?(y/n): ");
		repeat = input.next().charAt(0);
		
		}while(repeat == 'y');

	System.out.print("Thank you for using our service.");

	
	
	//close Scanner.
	input.close();
	}
	
	
	
}
