package ooad.VehicleDriver.vehicle;

public class Airplane extends Vehicle {

	public Airplane(String name, double fuel, double fuelEfficiency) {
		super(name, fuel, fuelEfficiency);
	}
	
    public int move(){
    	
    	System.out.println("Move airplane.");
    	return super.move();
    }
}
