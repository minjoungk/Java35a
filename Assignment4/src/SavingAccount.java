/*Min Joung Kim
*CIS 35A
*Assignment4-1
*May 9,2016
*May 9,2016*/
public class SavingAccount {
	protected static double annualInterestRate;
	protected double savingBalance;
	//set balance to savingBalance
	public SavingAccount(double balance){
		savingBalance = balance;
	}
	//set annualInterestRate
	public static void modifyMonthlyInterest(double annualInterest){
		annualInterestRate = (annualInterest/100);
	}
	//calculate MonthlyInterest
	public void calculateMonthlyInterest(){
		double currentBalance =0;
		if(savingBalance < 10000){
		
		double monthlyInterestRate = annualInterestRate /12;
		currentBalance = savingBalance * monthlyInterestRate/ (1- 1/ Math.pow(1+ monthlyInterestRate, 12));

		savingBalance += currentBalance;}
		else{
			double monthlyInterestRate = annualInterestRate /12;
			currentBalance = savingBalance * monthlyInterestRate/ (1- 1/ Math.pow(1+ monthlyInterestRate, 12));
			savingBalance -=currentBalance;
		}
		

	}
	//get depositMoney from an user
	//add up depositMoney to savingBalance
	public void deposit(double depositMoney){
		
		savingBalance += depositMoney;
		
	}
	//get withdrawMoney from an user
	//subtract withdrawMoney from savingBalance
	public void withdrawal(double withdrawMoney){
		
		savingBalance -= withdrawMoney;
		
	}
		
	//print current savingBalance
	public void print(){
		System.out.print("\nCurrent saving balance: $");
		System.out.printf("%.2f", savingBalance);
		
		
	}
	
}




