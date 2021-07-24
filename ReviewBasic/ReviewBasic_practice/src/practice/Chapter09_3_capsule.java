package practice;

public class Chapter09_3_capsule {
	
	public static void main(String[] args) {
        
        double fuelCost = 12.5; // 燃費（Km/L）
        double fuelAmount = 55.0; // 残量（L）

        Car_3_capsule car = new Car_3_capsule(fuelCost, fuelAmount);
        
        car.move(20);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
    }

}
