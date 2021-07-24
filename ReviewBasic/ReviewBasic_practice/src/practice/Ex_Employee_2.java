package practice;

public class Ex_Employee_2 extends Ex_Human_2 {
							//Ex_Human_2クラスを継承する
							//Ex_Human_2→スーパークラス、Ex_Employee_2→サブクラス

	private String department;

    public Ex_Employee_2(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getEmployeeProfile() {
        String profile = "年齢は" + this.age + "です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }

}
