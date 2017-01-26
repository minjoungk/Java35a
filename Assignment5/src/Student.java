/*Min Joung Kim
*CIS 35A
*Assignment7
*DueDate: June 6,2016
*June 7,2016*/


import java.lang.StringBuilder;
import java.lang.String;
public class Student {

	 private int SID;
	 private int scores[] = new int[5];


	 
	 
	 

	public Student(){
		//
	}
	public Student(int [] data){
		
		SID = data[0];
		
		for(int i = 0; i < scores.length; i++){
			
			scores[i] = data[i+1];
			
			
		}


		
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public int getScores(int count) {
		return scores[count];
	}

	public void setScores(int [] scores) {
		
	}

	

	public void printData(){
		
			System.out.printf("%d  %d  %d  %d  %d  %d", SID, scores[0],scores[1],scores[2],scores[3],scores[4]);
			
		
		System.out.println();
	}
 
	


}
