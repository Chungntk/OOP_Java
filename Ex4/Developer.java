
public class Developer extends Employee{
	
	private int nProjects;
	
	public Developer()
	{}
	
	public Developer(String name, String hometown, int basicSalary, int days, int nProjects)
	{
		super(name, hometown, basicSalary, days);
		this.nProjects = nProjects;
	}

    public int getNProjects() {
        return nProjects;
    }

    public void setNProjects(int nProjects) {
        this.nProjects = nProjects;
    }

	public int computeSalary()
	{
		return super.getBasicSalary() * super.getDays() + this.nProjects*100;
	}

	@Override
	public String toString() {
		return "Developer [name = " + super.getName() + ", hometown= " + super.getHometown()+ ", days= " + super.getDays() + ", nProjects=" + nProjects + ", computeSalary()=" + computeSalary() + "]";
	}
	
	public String getTitle(){
		return "Developer";
	}


}
