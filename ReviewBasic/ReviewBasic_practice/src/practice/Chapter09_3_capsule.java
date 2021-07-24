package practice;

public class Chapter09_3_capsule {
	
	public static void main(String[] args) {
        
        double fuelCost = 12.5; // 燃費（Km/L）
        double fuelAmount = 55.0; // 残量（L）

        Car_3_capsule car = new Car_3_capsule(fuelCost, fuelAmount);
        
        car.move(20);
        
//      System.out.println("残量は、" + car.fuelAmount + "です");	//同じように表示可能
//      car.fuelCost = 500;											//が、このように変更が加えられる恐れがある
//      car.fuelAmount = 500;										//そこでクラスのアクセス修飾子をprivateに
        //privateによって↑これで変更が加えられなくなったが、同時にSystem.out.printlnでの表示もcar.fuelAmountでは不可に
        //そこで、値取得のメソッドgetFuelAmount()を作成する↓
        System.out.println("残量は、" + car.getFuelAmount() + "です");
    }

}
