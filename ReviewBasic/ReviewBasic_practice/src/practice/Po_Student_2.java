package practice;

public class Po_Student_2 extends Po_Human_2 {
	
	private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public String getProfile() {
        String profile = "年齢は" + super.age + "です。";
        profile += "学生で、テストの点数は" + this.score + "点です。";
        return profile;
    }

}
