/*Min Joung Kim
*CIS 35A
*Assignment6
*DueDate: May 30,2016
*May 30,2016*/
import java.text.NumberFormat;
import java.util.Arrays;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Statistics {
	int[] lowscores = new int[5];
	int[] highscores = new int[5];
	float[] avgscores = new float[5];

	// This method will find the lowest score and store it in an array names lowscores
	int[] findlow(Student[] a) {

		int low, j = 0;
		do {
			low = a[0].getScores(j);

			for (int i = 2; i < a.length; i++) {
				if (a[i].getScores(j) < low) {
					// System.out.println(a[i].printScores(j));
					low = a[i].getScores(j);
				}
			}
			lowscores[j] = low;
			j++;
		} while (j < 5);


		return lowscores;
	}

	// This method will find the highest score and store it in an array names highscores
	int[] findhigh(Student[] a) {

		int high, j = 0;
		do {
			high = a[1].getScores(j);

			for (int i = 2; i < a.length; i++) {
				if (a[i].getScores(j) > high) {
					// System.out.println(a[i].printScores(j)); 
					high = a[i].getScores(j);
				}
			}
			highscores[j] = high;
			j++;
		} while (j < 5);

		return highscores;
	}

	// This method will find avg score for each quiz and store it in an array names avgscores
	float[] findavg(Student[] a) {
		int[] total_array = new int[5];
		int k = 0;

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);

		for (int i = 0; i < 5; i++) {
			for (k = 1; k < a.length; k++) {
				total_array[i] += a[k].getScores(i);
			}

		}

		//System.out.print("Average Score:");
		for (int i = 0; i < 5; i++) {
			try {
				avgscores[i] = (float) (total_array[i]) / (float) ((a.length - 1));
				//System.out.printf(" %-4.1f", avgscores[i]);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return avgscores;
	}
	
	public void printhigh(){
		System.out.println();
		System.out.print("High Score: ");

		System.out.println(Arrays.toString(highscores));
		
	}
		
	
	public void printlow(){
		System.out.print("Low Score: ");

		System.out.println(Arrays.toString(lowscores));
		
		
	}
	public void printavg(){
		BigDecimal [] a = new BigDecimal[5];
		
		for(int i=0;i<5;i++){
			a[i]=new BigDecimal(avgscores[i]).setScale(1, RoundingMode.HALF_EVEN);
			}
		System.out.print("Average Score: ");

			
			System.out.println(Arrays.toString(a));
		}

		
}

