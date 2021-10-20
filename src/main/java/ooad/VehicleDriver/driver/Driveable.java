package ooad.VehicleDriver.driver;

import ooad.VehicleDriver.vehicle.Vehicle;

public interface Driveable {

    public void drive(Vehicle v);
    
    public default void drive() {
		System.out.println("Pass vehicle to drive method parameter.");
	}	
}
