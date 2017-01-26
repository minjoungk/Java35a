/*Min Joung Kim
*CIS 35A
*Assignment2-p2
*April 25,2016
*April 25,2016*/
import java.util.Scanner;



public class Driver {
	public static void main(String[] args){
	Coin c = new Coin();
	Simulation s = new Simulation();
	
	
	Scanner input = new Scanner(System.in);
	System.out.println("please enter the number of tossing a coin: ");
	int num = input.nextInt();
	//s.toss(c);
	s.tossntimes(c, num);
	System.out.println("number of head: " + c.getHeadCount());
	System.out.println("number of tail: " + c.getTailCount());
	}
}
