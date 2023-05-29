public class Manager extends Employee{
    private int salaryCoef;

    public Manager(String name, String hometown, int basicSalary, int days, int salaryCoef){
        super(name, hometown, basicSalary, days);
        this.salaryCoef = salaryCoef;
    }

    public int getSalaryCoef() {
        return salaryCoef;
    }

    public void setSalaryCoef(int salaryCoef) {
        this.salaryCoef = salaryCoef;
    }

    public int computeSalary(){
        return super.computeSalary()*this.salaryCoef;
    }

    public String getTitle(){
        return "Manager";
    }
    
	@Override
	public String toString() {
		return "Manager [name=" + super.getName() + ", hometown=" + super.getHometown() + ", basicSalary=" + super.getBasicSalary() + ", days=" + super.getDays()
				+ " salaryCoef='" + getSalaryCoef() + "'" +", computeSalary()=" + computeSalary() + "]";
	}

}
