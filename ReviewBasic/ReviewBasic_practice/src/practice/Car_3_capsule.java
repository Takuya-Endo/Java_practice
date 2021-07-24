package practice;

public class Car_3_capsule {
	
//  public double fuelCost;	//外部（mainメソッド）で
//  public double fuelAmount;	//変更が加えられないようprivateに
    private double fuelCost;
    private double fuelAmount;
    
    public Car_3_capsule(double fuelCost, double fuelAmount) {
    	this.fuelCost = fuelCost;
    	this.fuelAmount = fuelAmount;
    }

    public void move(int distance) {
    	System.out.println(distance + "km走ります");
    	this.fuelAmount -= distance / this.fuelCost;
    }
    
    //privateとするとmainメソッドでcar.fuelAmountで値取得が出来ないため、
    //新たに値取得用のメソッドを用意する
    //例：値の取得「getter」メソッド　getフィールド名
    //例：値の変更「setter」メソッド　setフィールド名
    public double getFuelAmount() {
    	return this.fuelAmount;
    }

}
