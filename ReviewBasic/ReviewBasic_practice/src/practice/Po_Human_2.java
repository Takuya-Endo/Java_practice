package practice;

public class Po_Human_2 {
	
	private String name;
    protected int age;

    public Po_Human_2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //↓finalはオーバーライド禁止
    final public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getProfile() {
        return "名前は" + this.name + "、年齢は" + this.age + "です。";
    }

}
