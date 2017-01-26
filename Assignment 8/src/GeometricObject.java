/*Min Joung Kim
*CIS 35A
*Assignment8
*DueDate: June 13,2016
*June 11,2016*/

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

