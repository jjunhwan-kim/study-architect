package ooad.VehicleDriver.driver;

import ooad.VehicleDriver.vehicle.Bus;
import ooad.VehicleDriver.vehicle.Moveable;
import ooad.VehicleDriver.vehicle.Tank;
import ooad.VehicleDriver.vehicle.Vehicle;

public class Driver implements Driveable {
	
    private String name;
    private int distance;
    private Vehicle v;

    public Driver(String name) {
    	this.name = name;
    }

    public void drive(Vehicle v) {
    	System.out.println("Drive vehicle.");
    	distance += v.move();
    }

    /*
    public void drive(Vehicle[] vs) {
    	for (Vehicle v : vs) {
    		drive(v);
    		System.out.println("Total distance: " + distance);
    	}
    }
    */

    public void drive(Bus b) {
    	System.out.println("Drive bus.");
    	b.move();
    }

    public void drive(Tank t) {
    	System.out.println("Drive tank.");
    	t.move();
    }
    
    public void drive(Moveable m) {
    	System.out.println("Drive moveable.");
    	distance += m.move();
    }
    
    public void drive(Moveable[] ms) {
    	for (Moveable m : ms) {
    		drive(m);
    		System.out.println("Total distance: " + distance);
    		System.out.println();
    	}
    }

}
