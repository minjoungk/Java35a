/*Min Joung Kim
*CIS 35A
*Assignment2-p1
*April 25,2016
*April 25,2016*/
import java.util.Scanner;
import java.lang.String; 

public class Driver {
	public static void main(String[] args){
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter Name: ");
		String temp_name = input.nextLine(); 
		System.out.println("Please enter Number: ");
		String temp_number = input.nextLine();
		System.out.println("Please enter Age: ");
		int temp_age = input.nextInt();
		 input.nextLine();
		System.out.println("Please enter Address: ");
		String temp_address = input.nextLine();

		p1.setName(temp_name);
		p1.setNumber(temp_number);
		p1.setAddress(temp_address);
		p1.setAge(temp_age);
		p1.print();
		
		
		System.out.println("Please enter Name: ");
	    temp_name = input.nextLine(); 
		System.out.println("Please enter Number: ");
		temp_number = input.nextLine();
		System.out.println("Please enter Age: ");
		temp_age = input.nextInt();
		 input.nextLine();
		System.out.println("Please enter Address: ");
		temp_address = input.nextLine();
	

		
		p2.setName(temp_name);
		p2.setNumber(temp_number);
		p2.setAddress(temp_address);
		p2.setAge(temp_age);
		p2.print();
		
		
		System.out.println("Please enter Name: ");
		temp_name = input.nextLine(); 
		System.out.println("Please enter Number: ");
		temp_number = input.nextLine();
		System.out.println("Please enter Age: ");
		temp_age = input.nextInt();
		 input.nextLine();
		System.out.println("Please enter Address: ");
		temp_address = input.nextLine();
	

		
		
		p3.setName(temp_name);
		p3.setNumber(temp_number);
		p3.setAddress(temp_address);
		p3.setAge(temp_age);
		p3.print();
		
		
		



		



		
	}
}
