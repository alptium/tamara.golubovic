package bankloans;

public class RefinancingApplicant extends Applicant {
	
	private boolean isPermanentEmployee;
	private boolean isItMarried;

	public RefinancingApplicant(String name, String surname, int age, int salary, boolean isPermanentEmployee, boolean isItMarried) {
		super(name, surname, age, salary);
		
		this.isPermanentEmployee = isPermanentEmployee;
		this.isItMarried = isItMarried;
	}
	
	public boolean getIsPermenanetEmployee() {
		return isPermanentEmployee;
	}
	
	public boolean getIsItMarried() {
		return isItMarried; 					
	}
}
