package practice;

public class Car_2 {

	private double fuelCost;
	private double fuelAmount;
	
	public Car_2(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
	public void move(int distance) {
		System.out.println(distance + "km走ります"); 
		this.fuelAmount -= (distance / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}

}
