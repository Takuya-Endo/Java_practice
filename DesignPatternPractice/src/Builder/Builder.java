package Builder;

public interface Builder {
	
	public abstract void setPersonalInfo(int id, String name, int age, String department);
	public abstract Object getResult();

}
