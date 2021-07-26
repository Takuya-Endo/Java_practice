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
        
        
        //キャスト→型の変換を行うこと (データ型) 式
        
        Ex_Employee_2 employee = new Ex_Employee_2("田中", 28, "システム部");
        
        //アップキャスト
        //サブクラスのインスタンスemployeeをスーパークラスの変数humanに代入
        Ex_Human_2 human = 				employee;	//アップキャストの場合は型を指定しなくても自動で行われる
      //Ex_Human_2 human = (Ex_Human_2) employee;
        
        //	↑
        //1行でも記述可能
        //Employeeクラスのインスタンスを生成して、アップキャストでHumanクラスの変数に代入
        //Ex_Human_2 human = new Ex_Employee_2("田中", 28, "システム部");
        //	↑					↑
        //	↑				Ex_Employee_2 employee = new Ex_Employee_2("田中", 28, "システム部");
        //Ex_Human_2 human = (Ex_Human_2) employee;
        
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
        
        //ダウンキャスト
        //スーパークラスhumanからサブクラスtanakaへ変換
        Ex_Employee_2 tanaka = (Ex_Employee_2) human;	//型の指定が必要
        System.out.println("Employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

        Extend01_2.printName(sugimoto);
        Extend01_2.printName(sato);
        Extend01_2.printName(tanaka);
    }

    public static void printName(Ex_Human_2 human) {
        System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
    }

}
