package ooad.VehicleDriver.vehicle;

public class Vehicle implements Moveable {
    private double fuelEfficiency;
    private String name;
    private int distance;
    private double fuel;
    
	public Vehicle(String name, double fuel, double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
		this.name = name;
		this.distance = 0;
		this.fuel = fuel;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public int move(){
    	while (fuel >= 10 / fuelEfficiency) {
    		
    		fuel -= 10 / fuelEfficiency;
        	distance += 10;
        	
        	this.show();
    	}

    	System.out.println("No fuel left.");
    	
    	return distance;
    }
	
	
	public void show() {
		System.out.printf("%16s | %10d         %10.2f        %10.2f", this.name, this.distance , this.fuel, this.fuelEfficiency);
		System.out.println();
	}
	
	public static void showHeader() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("  %16s | %10s(km)  %10s(l)  %10s(km/l)\n", "name" , "distance", "fuel", "fuelEfficiency");
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public static void show(Vehicle[] vs) {
		showHeader();
		
		for(int i = 0; i < vs.length; i++) {
			System.out.printf("%16s | %10d         %10.2f        %10.2f", vs[i].name, vs[i].distance, vs[i].fuel, vs[i].fuelEfficiency);
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------");
	}
}
