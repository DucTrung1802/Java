
public class Developer extends Employee{
	
	private int nProjects;
	
	public Developer()
	{}
	
	public Developer(String name, String hometown, int basicSalary, int days, int nProjects)
	{
		super(name, hometown, basicSalary, days);
		this.nProjects = nProjects;
	}

	public int computeSalary()
	{
		return super.getBasicSalary() * super.getDays() + nProjects*100;
	}

	@Override
	public String toString() {
		return "Developer [name = " + super.getName() + ", hometown= " + super.getHometown() + ", nProjects=" + nProjects + ", computeSalary()=" + computeSalary() + "]";
	}
	
	
}
