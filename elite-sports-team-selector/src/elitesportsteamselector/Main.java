package elitesportsteamselector;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Welcome to the application page for our Basketball team!");
			System.out.println("If you want to join us please follow these simple steps.");
			System.out.println("In order to apply for this team fill out this form");
			
			runDemoSportsselector(); 
		}
	}
 			private static void runDemoSportsselector() {
 				
 				ArrayList<Sportsselector> acceptedList = new ArrayList<>();
 				ArrayList<Sportsselector> rejectedList = new ArrayList<>();
	
				try(Scanner sc = new Scanner(System.in)) {
					
					while(true) {
					
					System.out.println("What is your name?");
					String name = sc.next();
					
					System.out.println("What is your surname?");
					String surname = sc.next();
					
					System.out.println("What is your age?");
					int age = sc.nextInt();

					System.out.println("What is your gender?");
					char gender = sc.next().charAt(0);

					System.out.println("Do you have experience: true or false?");
					boolean hasExperience = sc.nextBoolean();

					System.out.println("What is your expected salary?");
					double salary = sc.nextDouble();
					
					Sportsselector sportsselector = new Sportsselector (name, surname, age, gender, hasExperience, salary);
		
				if (sportsselector.getHasExperience() == true && sportsselector.getSalary() <= 563.33 && sportsselector.getAge() >= 18 && sportsselector.getGender() == 'M') {
					System.out.println("Congratulation! You are accepted to basketball team!");
					acceptedList.add(sportsselector);
				} else {
					System.out.println("We are sorry, your request has been rejected");
					rejectedList.add(sportsselector);
				}
				
					System.out.println("Do you want to add new member?");
					System.out.println("If you want to continue click yes for you want to quit click no");
					String choice = sc.next();
					
					while (choice.equals("yes")) {
						System.out.println("In order to continue complete next form:");
						runDemoSportsselector();
					} if (choice.equals("no")) break;
					
					}
						System.out.println("List of accepted candidates:");
						
						int i = 1;
					
					for (Sportsselector sportsselector : acceptedList) {
						System.out.println("" + i + "." + "\t" + sportsselector.getName() + "\t" + sportsselector.getSurname());
						i++;
					}
					
					System.out.println("List of rejected candidates:");
					
					int j = 1;
					
					for(Sportsselector sportsselector : rejectedList) {
					System.out.println("" + j + "." + "\t" + sportsselector.getName() + "\t" + sportsselector.getSurname());
					j++;
			}	
		}
 	}
}
