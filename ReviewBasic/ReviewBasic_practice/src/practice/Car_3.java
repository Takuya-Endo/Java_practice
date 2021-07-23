package practice;

public class Car_3 {
	
    public double fuelCost; // 燃費（Km/L）
    public double fuelAmount; // 残量（L）

    public Car_3(double fuelCost, double fuelAmount) {
    	this.fuelCost = fuelCost;
    	this.fuelAmount = fuelAmount;
    }

    public void move(int distance) {
    	System.out.println(distance + "km走ります");
    	this.fuelAmount -= distance / this.fuelCost;
    }

    // fuelAmountを取得するメソッドを作成
    public double getFuelAmount() {
    	return this.fuelAmount;
    }

}
