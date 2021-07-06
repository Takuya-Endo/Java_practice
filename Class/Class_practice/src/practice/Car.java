package practice;

public class Car {
	
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
		//fuelCost = this.fuelCost;     //回答
		//fuelAmount = this.fuelAmount; //回答
		  this.fuelCost = fuelCost;     //解答
		  this.fuelAmount = fuelAmount; //解答
	}
	
	public void move(int distance) {
		System.out.println(distance + "km走ります");
		//fuelAmount = fuelAmount - (fuelCost * distance); //回答
		  this.fuelAmount -= (distance / fuelCost);			   //解答
	}
	
	public double getFuelAmount() {
		return this.fuelAmount; //解答
	}
}
