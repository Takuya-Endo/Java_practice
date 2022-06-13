package Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeesList employeesList = null;
		
		employeesList = new EmployeesList(3);
		employeesList.add(new Employee().setId(1).setName("EmployeeA"));
		employeesList.add(new Employee().setId(2).setName("EmployeeB"));
		employeesList.add(new Employee().setId(3).setName("EmployeeC"));
	
		Iterator itr = employeesList.iterator();
		while(itr.hasNext()){
			System.out.println(((Employee)itr.next()).getName());
		}
		
	}

}
