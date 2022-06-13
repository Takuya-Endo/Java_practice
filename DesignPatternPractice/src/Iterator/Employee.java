package Iterator;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String department;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}
	
	public Employee setId(int id) {
		this.id = id;
		return this;
	}
	public Employee setName(String name) {
		this.name = name;
		return this;
	}
	public Employee setAge(int age) {
		this.age = age;
		return this;
	}
	public Employee setDepartment(String department) {
		this.department = department;
		return this;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	
}
