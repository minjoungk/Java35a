/*Min Joung Kim
*CIS 35A
*Assignment2-p1
*April 25,2016
*April 25,2016*/
import java.util.Scanner;
public class Person {
	private String name;
			String address;
			String number;
			int age;
		
			Person(){
			
				name = null;
				address = null;
				number = null;
				age = 0;
				}

			public String getName() {
				return name;
			}
			public void setName(String temp_name) {
				name = temp_name;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String temp_address) {
				address = temp_address;
			}
			public String getNumber() {
				return number;
			}
			public void setNumber(String temp_number) {
				number = temp_number;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int temp_age) {
				age = temp_age;
			}

			public void print(){
				System.out.println("--Person's information--");
				System.out.println("Name: " + getName());
				System.out.println("Number: " + getNumber());
				System.out.println("Address: " + getAddress());
				System.out.println("Age: " + getAge());
				
			}
			

				

		
	
}

