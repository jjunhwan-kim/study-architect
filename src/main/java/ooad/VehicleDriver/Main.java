package ooad.VehicleDriver;

import ooad.VehicleDriver.driver.Driver;
import ooad.VehicleDriver.vehicle.Airplane;
import ooad.VehicleDriver.vehicle.Bus;
import ooad.VehicleDriver.vehicle.Tank;
import ooad.VehicleDriver.vehicle.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle("vehicle", 100, 100); // name, fuel, fuelEfficiency
		Bus b = new Bus("bus", 100, 12);
		Airplane a = new Airplane("airplane", 100, 0.1);
		Tank t = new Tank("tank", 50, 4);
		

		Driver d = new Driver("kim");
		
		Vehicle[] vs = {b, a, t};

		Vehicle.show(vs);
	
		d.drive();
		d.drive(vs);

		Vehicle.show(vs);
	}

}
