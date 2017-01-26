/*Min Joung Kim
*CIS 35A
*Assignment2-p2
*April 25,2016
*April 25,2016*/

//import java.lang.String;

public class Coin {
	private String sideUp  ;
			int headCount;
			int tailCount;
	public Coin(){
		sideUp = "head";
		headCount = 0;
		tailCount = 0;
		
	}

	public void setSideUp(int num){
		
		if(num == 1){
			sideUp= "head";
			headCount++;
		}else{
			sideUp = "tail";
			tailCount++;
		}
	}
	public String getSideUp(){
		
		return sideUp;
	}
	public int getHeadCount(){
		return headCount;
		
	}
	public int getTailCount(){
		return tailCount;
		
	}



}
