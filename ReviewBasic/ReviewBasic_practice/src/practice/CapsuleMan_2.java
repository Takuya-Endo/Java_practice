package practice;

public class CapsuleMan_2 {
	
	private String name;
    private int age;

    public CapsuleMan_2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public void setAge(int last_age) {
    	this.age = last_age;
    	return;
    }

}
