/*Min Joung Kim
*CIS 35A
*Assignment8
*DueDate: June 13,2016
*June 11,2016*/

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		
		Triangle t1 = new Triangle();
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
		
//		BigDecimal sides2[]= new BigDecimal[3];
//		for(int i = 0;i<sides.length;i++){
//			sides2[i] = BigDecimal.valueOf(sides[i]);
//		}
		
		
		t1Side.setSides(sides);
		t1Color.setColor(color);
		t1ColorFilled.setColorFilled(colorfilled);
		
		System.out.println("-------------------------------");
		System.out.println("Information of Triangle");		
//		t1.getArea2();
		System.out.println("Area: "+t1.getArea()+"cm^2");
		System.out.println("Parameter: "+t1.getParameter()+"cm");
		System.out.println("The color of triangle:  "+t1Color.getColor());
		System.out.print("Does a triangle is filled with color?  ");
		t1ColorFilled.getcolorfilled();
		
		
		
		
		input.close();
	}
}
