package practice;

public class Chapter09_2 {
	
	public static void main(String[] args) {
		
		double fuelCost = 12.5;
		double fuelAmount = 55.0;
		
		Car_2 car = new Car_2(fuelCost, fuelAmount);
		
		car.move(20);
		System.out.println("残量は" + car.getFuelAmount() + "です");
	
	}

}
