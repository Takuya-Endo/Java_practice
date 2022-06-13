package Iterator;

public class EmployeesListIterator implements Iterator {
	
	private EmployeesList employeesList;
	private int index;
	
	public EmployeesListIterator(EmployeesList employeesList) {
		
		this.employeesList = employeesList;
		this.index = 0;
		
	}
	
	@Override
	public boolean hasNext() {
		if(employeesList.getLastNum() > index){
            return true;
        }else{
            return false;
        }
	}

	@Override
	public Object next() {
		Employee employee = employeesList.getEmployeeAt(index);
        index++;
        return employee;
	}

}
