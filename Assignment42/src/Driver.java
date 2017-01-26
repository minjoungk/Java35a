/*Min Joung Kim
*CIS 35A
*Assignment4-2
*May 9,2016
*May 9,2016*/
public class Driver {
	public static void main(String[] args){
		//testing if Cargoship can access to both CargoShip and Ship.
		CargoShip []cargoship = new CargoShip[2];
		cargoship[0] = new CargoShip();
		cargoship[1] = new CargoShip();
		cargoship[0].setwidth(1000);
		cargoship[0].setHeight(300);
		
		System.out.println("The area of the first CargoShip: " + cargoship[0].getArea());
		
		cargoship[0].setNumOfContainer(30);
		System.out.println("The number of container in the first Cargoship: " + cargoship[0].getNumOfContainer());
		
		cargoship[1].setFastSpeed(false);
		cargoship[1].setFuel(34667);
		
		System.out.println("Fuel of the second CargoShip: " + cargoship[1].getFuel());
		
		
		
		
		//testing if CruiseSHip can access to both CruiseSHip and Ship
		CruiseShip[]cruiseship = new CruiseShip[2];
		cruiseship[0] = new CruiseShip();
		cruiseship[1] = new CruiseShip();
		
		
		cruiseship[0].setwidth(999);
		cruiseship[0].setHeight(4500);
		
		System.out.println("\nThe area of the first CruiseShip: " + cruiseship[0].getArea());
		
		cruiseship[0].setNumOfEvent(30);
		System.out.println("The number of container in the first CruiseShip: " + cruiseship[0].getNumOfEvent());
		
		cruiseship[1].setHasSwimmingPool(false);
		cruiseship[1].setNumOfRoom(67);
		
		System.out.println("The number of room in the second CruiseShip: " + cruiseship[1].getNumOfRoom());
		

		


	}
}
