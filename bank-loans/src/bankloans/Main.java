package bankloans;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
	
			// Cash loan
			
			int age = 18;
			double salary = 550.50;
			boolean isEmployed = true;
			boolean hasOneYearOfService = true;
			
			// Refinancing loan
			
			int age1 = 18;
			double paymentCheck = 600;
			boolean isItPermanentEmployed = true;
			boolean isItmarried = true;
			
			// Loans for pensioners
			
			int ages = 60;
			boolean isItPensioner = true;
			double pensionCheck = 300;
			
			System.out.println("Client questionnaire");
			System.out.println("Name:");
			String clientName = sc.next();
			
			System.out.println("Surname:");
			String clientSurname = sc.next();
			
			System.out.println("How old are you?");
			int clientsAge = sc.nextInt();
			
			System.out.println("Choose your loan cash, refinancing or loan for pensioners");
			String loanType = sc.next();
			
			if (loanType.equals("cash")) {
				
				System.out.println("Please enter your salary");
				double income = sc.nextDouble();
	
				System.out.println("Are you employed?");
				boolean employmentStatus = sc.nextBoolean();
				
				System.out.println("Do you have at least one year of service?");
				boolean yearOfService = sc.nextBoolean();
		
				if(clientsAge >= 18 && income >= 550.50 && employmentStatus == true && yearOfService == true) {
					System.out.println("Congratulations! Your loan has been approved!");
				} else {
					System.out.println("We are sorry! Your request has been rejected!");
				}
			}
			 
			if(loanType.equals("refinancing")) {
				
				System.out.println("Please enter your salary");
				double payment = sc.nextDouble();
	
				System.out.println("Are you permanent employed?");
				boolean permanentEmployee = sc.nextBoolean();
				
				System.out.println("Are you married?");
				boolean maritialStatus = sc.nextBoolean();
				
				if (clientsAge >= 18 && payment >= 550.50 && permanentEmployee == true && maritialStatus == true) {
					System.out.println("Congratulations! Your loan has been approved!");
				} else {
					System.out.println("We are sorry! Your request has been rejected!");
				}
			
				if(loanType.equals("loan for pensioners")) {
					
					System.out.println("Are you pensioner?");
					boolean pensionerConfirmation = sc.nextBoolean();
					
					System.out.println("Please inform us how much is your pension?");
					double pensionPayment = sc.nextDouble();
					
					if (clientsAge >= 60 && pensionerConfirmation == true && pensionPayment >= 300) {
						System.out.println("Congratulations! Your loan has been approved");
					} else { 
						System.out.println("We are sorry! Your request has been rejected!");
					}
					
						System.out.println()
					
					}
				}
			}
	}
}


