package practice;

public class Po_Employee_2 extends Po_Human_2 {
	
	private String department;

    public Po_Employee_2(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getProfile() {
        String profile = "年齢は" + this.age + "です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }

}
