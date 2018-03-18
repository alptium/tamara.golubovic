package bankloans;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {

			System.out.println("Welcome to the JBC bank!");
			System.out.println("If you want to apply for certain loan please answer the questionnaire.");
			System.out.println("Choose your loan: cash or refinancing?");
			String loanType = sc.next();
			
			if (loanType.equals("cash")) {
				runDemoCash();
			} else if (loanType.equals("refinancing")) {
				runDemoRefinancing();
			}
		}
	}
			private static void runDemoRefinancing() {
				
				try(Scanner sc = new Scanner(System.in)) {
				
				System.out.println("Please enter your name:");
				String name = sc.next();
				
				System.out.println("Please enter your surname:");
				String surname = sc.next();
				
				System.out.println("Please enter your age:");
				int age = sc.nextInt();
				
				System.out.println("Please enter your salary:");
				int salary = sc.nextInt();

				System.out.println("Are you permanent employed?");
				boolean isPermanentEmployee = sc.nextBoolean();
		
				System.out.println("Are you married?");
				boolean isItMarried = sc.nextBoolean();
		
				if (age >= 18 && salary >= 550.50 && isPermanentEmployee == true && isItMarried == true) {
					System.out.println("Congratulations! Your loan has been approved!");
				} else {
					System.out.println("We are sorry! Your request has been rejected!");
		
					System.out.println();
					
		}
	}
}
			private static void runDemoCash() {
				
				try(Scanner sc = new Scanner(System.in)) {
					
					System.out.println("Please enter your name:");
					String name = sc.next();
					
					System.out.println("Please enter your surname:");
					String surname = sc.next();
					
					System.out.println("Please enter your age:");
					int age = sc.nextInt();
					
					System.out.println("Please enter your salary:");
					int salary = sc.nextInt();

					System.out.println("Are you employed?");
					boolean isItEmployed = sc.nextBoolean();
		
					System.out.println("Do you have at least one year of service?");
					boolean hasOneYearOfService = sc.nextBoolean();

					if(age >= 18 && salary >= 550.50 && isItEmployed == true && hasOneYearOfService == true) {
						System.out.println("Congratulations! Your loan has been approved!");
					} else {
						System.out.println("We are sorry! Your request has been rejected!");
			}
		}
	}
}


