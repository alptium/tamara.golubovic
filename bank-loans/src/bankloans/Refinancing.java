package bankloans;

public class Refinancing {
	
		private String name;
		private String surname;
		private int age;
		private int salary;
		private boolean isPermanentEmployee;
		private boolean isItMarried;
	
		public Refinancing(String name, String surname, int age, int salary, boolean isPermanentEmployee, boolean isItMarried) {
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.isPermanentEmployee = isPermanentEmployee;
		this.isItMarried = isItMarried;
		
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
		public boolean getIsPermenanetEmployee() {
			return isPermanentEmployee;
		}
		public boolean getIsItMarried() {
			return isItMarried; 					
	}
}
