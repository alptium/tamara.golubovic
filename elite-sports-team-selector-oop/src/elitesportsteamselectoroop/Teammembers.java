package elitesportsteamselectoroop;

public class Teammembers {

	// Attributes of the class Team
	
	private String name;
	private String surname;
	private int age;
	private char gender;
	private boolean hasExperience;
	private double salary; 
	
	// Construction for the class Team {
	
	public Teammembers(String name, String surname, int age, char gender, double salary){
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.hasExperience = hasExperience;
		this.salary = salary;
}
	
	// Methods of the class Teammembers
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
		
	}
	
	public boolean hasExperience() {
		return hasExperience;
		
	}
	
	public double getSalary() {
		return salary;
		
	}
	
	public void playGamesTogether() {
		System.out.println("Play games together...");
	
	}
	
	public void listenToTheirSelector() {
		System.out.println("Listen to their selector..");
		
	}
	
	public void helpEachOther() {
		System.out.println("Help each other...");
		
	}

}
