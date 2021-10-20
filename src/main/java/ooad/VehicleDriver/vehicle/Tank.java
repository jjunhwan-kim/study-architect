package ooad.VehicleDriver.vehicle;

public class Tank extends Vehicle {

	public Tank(String name, double fuel, double fuelEfficiency) {
		super(name, fuel, fuelEfficiency);
	}
	
    public int move(){
    	
    	System.out.println("Move tank.");
    	return super.move();
    }

}
