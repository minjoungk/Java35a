package assignment9;
/*Min Joung Kim
*CIS 35A
*Assignment9
*DueDate: June 20,2016
*June 25,2016*/
import java.util.*;
import javax.swing.*;

import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CustomerInfo {
	
	
	
	private int oneBedroom;
	private int twoBedroom;
	private int numOfBoat;
	private int numOfWeek;
	private Integer dateTemp;
	private String fullName;
	private int total;
	StringBuilder info1,info2,info3,info4,info5, info6, info7;
	Font font;
	
	
	CustomerInfo(){
		
		oneBedroom = 0;
		twoBedroom = 0;
		numOfBoat = 1;
		numOfWeek = 1;
		fullName = "";
		total = 0;
		
	}
	public void setOneBedroom(boolean oneBedroom) {
		
		if(oneBedroom == true){
			this.oneBedroom = 1;
		}else{
			this.oneBedroom = 0;
		}
		
	}
	public void setTwoBedroom(boolean twoBedroom) {
		if(twoBedroom == true){
			this.twoBedroom = 1;
		}else{
			this.twoBedroom = 0;
		}
	}
	public void setNumOfBoat(boolean boat,int numOfBoat) {
		
		if(boat == true){
			this.numOfBoat = 1 * numOfBoat;
		}else{
			this.numOfBoat = 0;
		}
		
		
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setNumOfWeek(int numOfWeek) {
		this.numOfWeek = numOfWeek;
	}
	public void setDate(int date) {
		dateTemp = date;
	}
	public void calculate(){
		
		total = (oneBedroom * 600 * numOfWeek) + (twoBedroom * 850 * numOfWeek) + (numOfBoat * 60* numOfWeek);
		
	}

	
	public void printInfo(JTextArea t) throws ParseException{
		
		//calculate CHECK-OUT DATE
		SimpleDateFormat originalFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = originalFormat.parse(dateTemp.toString());
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_WEEK,7*numOfWeek);
		Date date2 = cal.getTime();

		
		info1 = new StringBuilder("FULLNAME: ");
		info1.append(this.fullName);
		
		info2 = new StringBuilder("\n\nCHECK IN: ");
		String temp1 = date.toString();
		info2.append(temp1);
		
		info6 = new StringBuilder("\n\nCHECK OUT: ");
		String temp6 = date2.toString();
		info6.append(temp6);
		calculate();
		info3 = new StringBuilder("\n\nTotal amount: $");
		String temp2 = Integer.toString(total);
		info3.append(temp2);
		
		info4 = new StringBuilder("\n\nOne Bedroom Cottage:");
		String temp3 = Integer.toString(oneBedroom);
		info4.append(temp3);
		info4.append("Two Bedroom Cottage:");
		String temp4 = Integer.toString(twoBedroom);
		info4.append(temp4);
		
		info5 = new StringBuilder("\n\nBoat: ");
		String temp5 = Integer.toString(numOfBoat);
		info5.append(temp5);
		
		info7 = new StringBuilder("\n\nThank you!");
		
		
		
		
				
		
		
		
		info1.append(info2);
		info1.append(info6);
		info1.append(info4);
		info1.append(info5);
		info1.append(info3);
		info1.append(info7);
		
		//System.out.println(info1);
		
		
		String s = info1.toString();
		
		t.append(s);
	
		
	}
	public StringBuilder getInfo1() {
		
		return info1;
	}

	
	
	

	
	
	
}
