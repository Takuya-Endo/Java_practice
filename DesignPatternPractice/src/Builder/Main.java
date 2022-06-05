package Builder;

public class Main {
	
	public static void main(String[] args) {
		
		Builder builder = new EmployeeBuilder();
		new Director(builder).constract();
		Employee employee = (Employee) builder.getResult();
		System.out.println(employee);
		
	}

}
