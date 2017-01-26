/*Min Joung Kim
*CIS 35A
*Assignment6
*DueDate: May 30,2016
*May 30,2016*/
import java.util.Arrays;
import java.lang.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.io.Serializable;
public class SerializableFile implements Serializable{
	
	private static boolean debug = true;
	private int [][] studentDatas=new int [15][6];
	private int[] lowscores = new int[5];
	private int[] highscores = new int[5];
	private float[] avgscores = new float[5];
	
	public SerializableFile(Student [] lab2){
		for(int row = 0; row < 15; row++){
			for(int colume = 0; colume < 5; colume++){
				studentDatas[row][colume]=lab2[row].getScores(colume);
			}
		}
		
		//getting statistical numbers
		Statistics stat = new Statistics();
		lowscores=stat.findlow(lab2);
		highscores=stat.findhigh(lab2);
		avgscores=stat.findavg(lab2);
		

		
	}
	public void printscores(){
		if(debug){
		for(int row = 0; row < 15; row++){
			for(int colume = 0; colume < 5; colume++){
				System.out.print(studentDatas[row][colume]);
				System.out.print(" ");
			}
			System.out.println();
			
		}
		}
		
	}
	public void printhigh(){
		if(debug){
		System.out.println();
		System.out.print("High Score: ");

		System.out.println(Arrays.toString(highscores));
		}
	}
		
	
	public void printlow(){
		if(debug){
		System.out.print("Low Score: ");

		System.out.println(Arrays.toString(lowscores));
		
		}
	}
	public void printavg(){
		
		if(debug){
		BigDecimal [] a = new BigDecimal[5];
		
		for(int i=0;i<5;i++){
			a[i]=new BigDecimal(avgscores[i]).setScale(1, RoundingMode.HALF_EVEN);
			}
		System.out.print("Average Score: ");

			
			System.out.println(Arrays.toString(a));}

	}	
}

