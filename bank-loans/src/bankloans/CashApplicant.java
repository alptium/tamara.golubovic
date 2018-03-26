package bankloans;

public class CashApplicant extends Applicant {
	private boolean isItEmployed;
	private boolean hasOneYearOfService;
	
	public CashApplicant(String name, String surname, int age, int salary, boolean isItEmployed, boolean hasOneYearOfService) {
		super(name, surname, age, salary);
		
		this.isItEmployed = isItEmployed;
		this.hasOneYearOfService = hasOneYearOfService;
	}
	
	public boolean getIsItEmployed() {
		return isItEmployed;
	}
	
	public boolean getHasOneYearOfService() {
		return hasOneYearOfService; 					
	}
}
