package practice;

public class Ex_Student_2 extends Ex_Human_2 {
						//Ex_Human_2クラスを継承する
						//Ex_Human_2→スーパークラス、Ex_Student_2→サブクラス
	
	private int score;

    public Ex_Student_2(String name, int age, int score) {
        super(name, age);
        //スーパークラスのインスタンスを指す
        this.score = score;
    }

    public String getStudentProfile() {
        String profile = "年齢は" + super.age + "です。";
        profile += "学生で、テストの点数は" + this.score + "点です。";
        return profile;
    }

}
