package practice;

public class Extend01_2 {
	
	public static void main(String[] args) {
        
		Ex_Human_2 sugimoto = new Ex_Human_2("杉本", 16);
        System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());
        //Ex_Human_2のコンストラクタでインスタンスsugimotoを作成しgetterメソッドで取得して表示
        
        Ex_Student_2 sato = new Ex_Student_2("佐藤", 17, 70);
        System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
        System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getStudentProfile());
        //Ex_Student_2のコンストラクタでインスタンスsatoを作成しgetterメソッドで取得して表示
        //Ex_Student_2のコンストラクタのうち、nameとageはEx_Human_2から継承
        //scoreはEx_Student_2のコンストラクタで新たに作成
        
        
        //アップキャスト
        Ex_Human_2 human = new Ex_Employee_2("田中", 28, "システム部");
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());

        Employee tanaka = (Employee) human;
        System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

        Extend01.printName(sugimoto);
        Extend01.printName(sato);
        Extend01.printName(tanaka);
    }

    public static void printName(Human human) {
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
    }

}
