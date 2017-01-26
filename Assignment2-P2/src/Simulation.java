/*Min Joung Kim
*CIS 35A
*Assignment2-p2
*April 25,2016
*April 25,2016*/
import java.util.Random;

public class Simulation {
	
	Simulation(){
		
	}
	public void toss(Coin x){
		Random rand =new Random();
		int randomNum = 1;
		int max = 2;
		int min = 1;
			
		randomNum = rand.nextInt((max-min)+1);
		x.setSideUp(randomNum);
		System.out.println(x.getSideUp());
			
		
		
	}
	public void tossntimes(Coin al, int x){
		Random rand =new Random();
		int [] randomNum = new int[x];
		int max = 2;
		int min = 1;
		for(int i = 0; i < x;i++){
			
			 randomNum[i] = rand.nextInt((max-min)+1);
			 al.setSideUp(randomNum[i]);
			 System.out.println(al.getSideUp());
			
		}

	}
}
