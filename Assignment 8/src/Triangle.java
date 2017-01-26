/*Min Joung Kim
*CIS 35A
*Assignment8
*DueDate: June 13,2016
*June 11,2016*/
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.*;
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
