package Iterator;

public class EmployeesList implements Aggregate {

	@Override
	public Iterator iterator() {
		return new EmployeesListIterator();
	}

}
