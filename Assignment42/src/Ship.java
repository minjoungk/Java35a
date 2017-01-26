/*Min Joung Kim
*CIS 35A
*Assignment4-2
*May 9,2016
*May 9,2016*/


public class Ship {
	protected int height;
	protected  int width;
	protected String color;
	protected String material;
	protected int NumOfPeople;
	protected int fuel;
	
	
//initialize instance variable	
	public Ship(){
		height =0;
		width =0;
		NumOfPeople =0;
		fuel =0;
	}
	
//getter and setter for each instance variable.	
	public void setHeight(int height){
		this.height = height;
	}
	public void setwidth(int width){
		this.width = width;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setMaterial(String material){
		this.material = material;
	}
	public int getArea(){
		
		return (height * width);
	}
	public int getFuel(){
		
		return fuel;
	}
	public void setFuel(int fuel){
		this.fuel = fuel;
	}
	public int getNumOfPeople() {
		System.out.println("11234");
		return NumOfPeople;
	}
	public void setNumOfPeople(int numOfPeople) {
		NumOfPeople = numOfPeople;
	}
	
			  
}
