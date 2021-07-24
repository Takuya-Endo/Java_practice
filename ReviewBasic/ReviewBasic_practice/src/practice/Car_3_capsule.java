package practice;

public class Car_3_capsule {
	
    public double fuelCost;
    public double fuelAmount;

    public Car_3_capsule(double fuelCost, double fuelAmount) {
    	this.fuelCost = fuelCost;
    	this.fuelAmount = fuelAmount;
    }

    public void move(int distance) {
    	System.out.println(distance + "km走ります");
    	this.fuelAmount -= distance / this.fuelCost;
    }

    public double getFuelAmount() {
    	return this.fuelAmount;
    }

}
