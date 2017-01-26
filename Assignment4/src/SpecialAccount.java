/*Min Joung Kim
*CIS 35A
*Assignment4-1
*May 9,2016
*May 9,2016*/
public class SpecialAccount extends SavingAccount {
	//if balance exceeds 10000, charge 10% of the balance amount
	public SpecialAccount(double balance){
		
		super(balance);
		if(balance > 10000){
			payingTenPercent();
		}
	}
//if balance exceeds 10000, charge 10% of the balance amount
	public void payingTenPercent(){
		System.out.println("warning!!! Since your balance is over 10000,\n 10% interest of your balance should be paid.");
		super.modifyMonthlyInterest(10);
		super.calculateMonthlyInterest();
		
		
		
	}
//Overridden function. 
//Includes only payingTenPercent() function to check if savingBalance is over 10000
	public void calculateMonthlyInterest(){
		
		super.calculateMonthlyInterest();
		
		if(savingBalance > 10000){
			payingTenPercent();
		}

		

	}
}
