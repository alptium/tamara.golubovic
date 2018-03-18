package elitesportsteamselector;

public class Sportsselector {
	
		private String name;
		private String surname;
		private int age;
		private char gender;
		private boolean hasExperience;
		private double salary; 
		
		public Sportsselector(String name, String surname, int age, char gender, boolean hasExperience, double salary){
			
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.gender = gender;
			this.hasExperience = hasExperience;
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
		
		public char getGender() {
			return gender;
			
		}
		
		public boolean hasExperience() {
			return true;
			
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

		public boolean getHasExperience() {
			return false;
		}
}
