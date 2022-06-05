package Builder;

public class EmployeeBuilder implements Builder {

	private Employee employee;
	
	public EmployeeBuilder() {
		this.employee = new Employee();
	}
	
	@Override
	public void setPersonalInfo(int id, String name, int age, String department) {
		this.employee.setId(id);
		this.employee.setName(name);
		this.employee.setAge(age);
		this.employee.setDepartment(department);
	}

	@Override
	public Object getResult() {
		return this.employee;
	}

}
