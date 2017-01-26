/*Min Joung Kim
*CIS 35A
*Assignment4-2
*May 9,2016
*May 9,2016*/
public class CruiseShip extends Ship{
	
	private int numOfEvent;
	private int numOfRoom;
	private int numOfFloor;
	private boolean hasSwimmingPool;
	private int numOfLifeboat;
	private boolean isNiceDesign;
	private boolean comfortableSpeed;
	
	public CruiseShip(){
		numOfEvent =0;
		numOfRoom =0;
		numOfFloor =0;
		hasSwimmingPool = true;
		numOfLifeboat =0;
		isNiceDesign = true;
		comfortableSpeed = true;
		
		
	}
//get the number of Event in a CruiseShip
	public int getNumOfEvent() {
		return numOfEvent;
	}
//get if a CruiseShip has SwimmingPool
	public boolean hasSwimmingPool() {
		return hasSwimmingPool;
	}
//get if a CruiseShip has SwimmingPool
	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}
//get if a CruiseShip is Nicely designed
	public boolean isNiceDesign() {
		return isNiceDesign;
	}
//set if a CruiseShip is Nicely designed
	public void setNiceDesign(boolean isNiceDesign) {
		this.isNiceDesign = isNiceDesign;
	}
	//get if a CruiseShip is running at comfortable speed
	public boolean isComfortableSpeed() {
		return comfortableSpeed;
	}
	//set if a CruiseShip is running at comfortable speed

	public void setComfortableSpeed(boolean comfortableSpeed) {
		this.comfortableSpeed = comfortableSpeed;
	}
	//set the number of event in a CruiseShip
	public void setNumOfEvent(int numOfEvent) {
		this.numOfEvent = numOfEvent;
	}
	//get the number of Room in a CruiseShip
	public int getNumOfRoom() {
		return numOfRoom;
	}
	//set the number of Room in a CruiseSHip
	public void setNumOfRoom(int numOfRoom) {
		this.numOfRoom = numOfRoom;
	}
	//get the number of floor in a CruiseShip
	public int getNumOfFloor() {
		return numOfFloor;
	}
	//set the number of floor in a CruiseSHip
	public void setNumOfFloor(int numOfFloor) {
		this.numOfFloor = numOfFloor;
	}
	//get the number of lifeboat in a CruiseShip
	public int getNumOfLifeboat() {
		return numOfLifeboat;
	}
	//set the number of lifeboat in a CruiseSHip
	public void setNumOfLifeboat(int numOfLifeboat) {
		this.numOfLifeboat = numOfLifeboat;
	}
	
	
	
}
