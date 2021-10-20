package ooad.VehicleDriver.vehicle;

public class Bus extends Vehicle {

	public Bus(String name, double fuel, double fuelEfficiency) {
		super(name, fuel, fuelEfficiency);
	}
	
    public int move(){
    	
    	System.out.println("Move Bus.");
    	return super.move();
    }
}
