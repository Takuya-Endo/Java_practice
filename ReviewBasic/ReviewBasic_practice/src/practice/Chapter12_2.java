package practice;

public class Chapter12_2 {
	
	public static void main(String[] args) {
		
        CapsuleMan_2 man = new CapsuleMan_2("小林", 32);
        
        System.out.println("名前は" + man.getName() +  "です。");
        System.out.println("年齢は" + man.getAge() + "です。");
        
        man.setAge(33);
        
        System.out.println("誕生日を迎えたので、年齢が" + man.getAge() + "になりました。");
    }

}
