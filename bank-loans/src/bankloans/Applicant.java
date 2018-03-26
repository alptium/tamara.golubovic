package bankloans;

public class Applicant {
	private String name;
	private String surname;
	private int age;
	private int salary;
	
	public Applicant(String name, String surname, int age, int salary) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getSalary() {
		return salary;
	}
}
