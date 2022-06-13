package Iterator;

public class EmployeesList implements Aggregate {

	@Override
	public Iterator iterator() {
		return new EmployeesListIterator(this);
	}
	
	protected Employee[] employees;
    private int last = 0;

    public EmployeesList(){}
    public EmployeesList(int employeesCount){
        this.employees = new Employee[employeesCount];
    }
 
    public void add(Employee student){
        employees[last] = student;
    	last++;
    }
    public Employee getEmployeeAt(int index){
        return employees[index];
    }
    public int getLastNum(){
        return last;
    }

}
