package elitesportsteamselector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Basketball team
		
		try(Scanner sc = new Scanner(System.in)) {
		
			int age = 18;
			char gender = 'M';
			boolean hasExperience = true;
			double salary = 563.33;
		
			System.out.println("In order to apply for this team fill out this form");
			System.out.println("What is your age?");
			int yourAge = sc.nextInt();
		
			System.out.println("What is your gender?");
			char yourGender = sc.next().charAt(0);
		
			System.out.println("I have experience: true or false?");
			boolean yourExperience = sc.nextBoolean();
		
			System.out.println("What is your expected salary?");
			double yourSalary = sc.nextDouble();
		
			if (yourExperience == true && yourSalary <= 563.33 && yourAge >= 18 && yourGender == 'M') {
				System.out.println("Congratulation! You are accepted to basketball team!");	
			} else {
				System.out.println("We are sorry, your request has been rejected");
			}
		
			}

		}

}
