package practice;

public class Po_Student_2 extends Po_Human_2 {
	
	private int score;

    public Po_Student_2(String name, int age, int score) {
        super(name, age);	//スーパークラスであるPo_Human_2クラスを継承して、
        this.score = score;	//int score を追加
    }

    public String getProfile() {
        String profile = "年齢は" + super.age + "です。";
        profile += "学生で、テストの点数は" + this.score + "点です。";
        return profile;
    }

}
