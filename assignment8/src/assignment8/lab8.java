package assignment8;

/*Min Joung Kim
*CIS 35A
*Assignment8
*DueDate: June 13,2016
*June 11,2016*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.*;
import java.util.Scanner;



public class lab8 {
	abstract public class GeometricObject {
		private double [] sides; 
		private boolean colorFilled;
		private String color;
		
		//Since I cannot create abstract class object, I moved it to Triangle class.
		/*
		  class Side{
			
			public void setSides(int [] tempSides){
				for(int i = 0; i<tempSides.length;i++){
					
					sides[i] = tempSides[i];
				}
				
			}
			public double[] getSides(){
				
				return sides;
			}
			
		}
		 class ColorFilled{
			public void setColorFilled(boolean tempColorFilled){
				
				colorFilled = tempColorFilled;
			}
			public boolean getColorFilled(){
				
				return colorFilled;
			}
			
		}
		
		 class Color{
			public void setColor(String tempColor){
				
				color = tempColor;
			}
			public String getColor(){
				
				return color;
			}
			
		}
		*/
		
		 public abstract double getArea();
		 public abstract double getParameter();
		
	}


	public class Triangle extends GeometricObject{
		
		private BigDecimal [] sides2;
		private double [] sides; 
		private boolean colorFilled;
		private String color;
		
		Triangle(){
			
			sides= new double[3];
		//	sides2= new BigDecimal[3];
			colorFilled = false;
			color = new String();
			
			
		}
		//Inner class: side
		class Side{
			
			public void setSides(double [] tempSides){
				for(int i = 0; i<tempSides.length;i++){
					
					sides[i] = tempSides[i];
				}

				
			}
			public double[] getSides(){
				
				return sides;
			}
			
		}
		//Inner class: filling color
		 class ColorFilled{
			public void setColorFilled(boolean tempColorFilled){
				
				colorFilled = tempColorFilled;
			}
			public boolean getColorFilled(){
				
				return colorFilled;
			}
			//return whether Triangle is filled with color or not.
			public void getcolorfilled(){
				if(colorFilled == true){
					System.out.println("Color is filled");
				}else{
					System.out.println("Color is not filled. Empty.");
				}
			}
		}
		//Inner class: color
		 class Color{
			public void setColor(String tempColor){
				
				color = tempColor;
			}
			public String getColor(){
				
				return color;
			}
			
		}
		 // define Triangle getArea function
		public double getArea(){
			//calculate triangle area with Heron's formula
			double area=0.0;
			double temp;
			double p =0.0;
			
			//add up all sides length
			for(int i =0;i<sides.length; i++){
				p+=sides[i];
			}
			
			p/=2;
			
			temp = (p)*(p-sides[0])*(p-sides[1])*(p-sides[2]);
			area = Math.pow(temp, 0.5);
			BigDecimal a = new BigDecimal(area);
			BigDecimal b= a.setScale(2, RoundingMode.HALF_EVEN);
			area = b.doubleValue();
					
			return area;
			
			
			
			
		}
		 
	/*	public void getArea2(){
			//calculate triangle area with Heron's formula
			double area=0.0;
			double temp;
			double p =0.0;
			
			//add up all sides length
			for(int i =0;i<sides.length; i++){
				p+=sides[i];
			}
			
			p/=2;
			
			temp = (p)*(p-sides[0])*(p-sides[1])*(p-sides[2]);
			area = Math.pow(temp, 0.5);
			BigDecimal a = new BigDecimal(area);
			BigDecimal b= a.setScale(2, RoundingMode.HALF_EVEN);
			 System.out.print(b);
					
			
			
			
			
			
		}*/
		
		//define Triangle getParameter function.
		public double getParameter(){
			double p = 0.0;
			
			for(int i =0;i<sides.length; i++){
				p+=sides[i];
			}
			BigDecimal a = new BigDecimal(p);
			BigDecimal b = a.setScale(2, RoundingMode.HALF_EVEN);
			p = b.doubleValue();
			return p;
		}
}


		public static void main(String[] args){
			
			
			lab8 lab = new lab8();
			Triangle t1 = lab.new Triangle();
			double [] sides= new double[3];
			String color = new String();
			boolean colorfilled;
			boolean DEBUG1 = false;
			boolean DEBUG2 = false;

			//prompt user to put information about a triangle
			
			Scanner input = new Scanner(System.in);
			//Since it cannot handle big number, test to see sides numbers are acceptable.
			do{
			DEBUG1 = false;
			System.out.println("Please enter three sides of Triangle: ");
			
			
			for(int i=0; i<sides.length;i++){
				sides[i] = input.nextDouble();
				if(sides[i] < 0.0 || sides[i]> 30.0){
					System.out.println("It cannot handle more than 30cm.");
					DEBUG1 = true;
				}
			}
			}while(DEBUG1);
			
			do{
			DEBUG2 = false;
			System.out.println("Please enter if the triangle color is filled (true/false):");
			colorfilled = input.nextBoolean();
			if(colorfilled != true && colorfilled != false){
				DEBUG2 = true;
			}
			input.nextLine();
			
			}while(DEBUG2);
			
			System.out.println("Please enter the color of triangle: ");
			color = input.nextLine();
			
			//create inner class objects.
			Triangle.Side t1Side = t1.new Side();
			Triangle.Color t1Color =t1.new Color();
			Triangle.ColorFilled t1ColorFilled = t1.new ColorFilled();
			
			//set information into a triangle object
			
//			BigDecimal sides2[]= new BigDecimal[3];
//			for(int i = 0;i<sides.length;i++){
//				sides2[i] = BigDecimal.valueOf(sides[i]);
//			}
			
			
			t1Side.setSides(sides);
			t1Color.setColor(color);
			t1ColorFilled.setColorFilled(colorfilled);
			
			System.out.println("-------------------------------");
			System.out.println("Information of Triangle");		
//			t1.getArea2();
			System.out.println("Area: "+t1.getArea()+"cm^2");
			System.out.println("Parameter: "+t1.getParameter()+"cm");
			System.out.println("The color of triangle:  "+t1Color.getColor());
			System.out.print("Does a triangle is filled with color?  ");
			t1ColorFilled.getcolorfilled();
			
			
			
			
			input.close();
		}
	}

