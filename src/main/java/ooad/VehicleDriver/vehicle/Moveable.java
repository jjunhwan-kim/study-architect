package ooad.VehicleDriver.vehicle;

public interface Moveable {

	public default int move() {
		
		System.out.println("Move moveable.");
		return 0;
	}
}
