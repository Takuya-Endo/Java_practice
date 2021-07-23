package practice;

public class Chapter09_3 {
	
	public static void main(String[] args) {
        
        double fuelCost = 12.5; // 燃費（Km/L）
        double fuelAmount = 55.0; // 残量（L）

        Car_3 car = new Car_3(fuelCost, fuelAmount);
//        System.out.println(car.fuelCost);
//        System.out.println(car.fuelAmount);
        
        car.move(20);
//        System.out.println(car.fuelAmount);
//        System.out.println(fuelAmount);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
    }

}
