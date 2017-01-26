/*Min Joung Kim
*CIS 35A
*Assignment4-2
*May 9,2016
*May 9,2016*/
public class CargoShip extends Ship{
	
	private int numOfContainer;
	private int numOflots;
	private int numOfGoods;
	private boolean durability = true;
	private boolean fastSpeed = true;
	
//initialize instance variables
	public CargoShip(){
		 numOfContainer =0;
		 numOflots =0;
		 numOfGoods =0;
		 durability = true;
		fastSpeed = true;
	}
//get if a CargoShip is Durability
	public boolean isDurability() {
		return durability;
	}
//set if a CargoShip is Durability
	public void setDurability(boolean durability) {
		this.durability = durability;
	}
//get if a CargoShip is fast
	public boolean isFastSpeed() {
		return fastSpeed;
	}
//set if a CargoShip is fast

	public void setFastSpeed(boolean fastSpeed) {
		this.fastSpeed = fastSpeed;
	}
	//get the number of container

	public int getNumOfContainer() {
		return numOfContainer;
	}
	//set the number of container
	public void setNumOfContainer(int numOfContainer) {
		this.numOfContainer = numOfContainer;
	}
	//get the number of floor in a CargoShip
	public int getNumOflots() {
		return numOflots;
	}
	//set the number of floor in a CargoShip

	public void setNumOflots(int numOflots) {
		this.numOflots = numOflots;
	}
	//get the number of Goods in a CargoShip

	public int getNumOfGoods() {
		return numOfGoods;
	}
	//set the number of Goods in a CargoShip

	public void setNumOfGoods(int numOfGoods) {
		this.numOfGoods = numOfGoods;
	}
	
	
	
	
}
