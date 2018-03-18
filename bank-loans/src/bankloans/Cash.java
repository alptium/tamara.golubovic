package bankloans;

public class Cash {

		private String name;
		private String surname;
		private int age;
		private int salary;
		private boolean isItEmployed;
		private boolean hasOneYearOfService;
		
		public Cash(String name, String surname, int age, int salary, boolean isItEmployed, boolean hasOneYearOfService) {
			
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.salary = salary;
			this.isItEmployed = isItEmployed;
			this.hasOneYearOfService = hasOneYearOfService;
			
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
			public boolean getIsItEmployed() {
				return isItEmployed;
			}
			public boolean getHasOneYearOfService() {
				return hasOneYearOfService; 					
	}
}
