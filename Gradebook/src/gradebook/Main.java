package gradebook;

import java.util.Scanner;

public class Main

	{

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) { 
	
			System.out.println("1.Student name");
			String name1 = sc.next();
			
			System.out.println("1.Student surname");
			String surname1 = sc.next();
			
			System.out.println("1.Student grade");
			double grade1 = sc.nextDouble();
			
			System.out.println("2.Student name");
			String name2 = sc.next();
			
			System.out.println("2.Student surname");
			String surname2 = sc.next();
			
			System.out.println("2.Student grade");
			double grade2 = sc.nextDouble();
			
			System.out.println("3.Student name");
			String name3 = sc.next();
			
			System.out.println("3.Student surname");
			String surname3 = sc.next();
			
			System.out.println("3.Student grade");
			double grade3 = sc.nextDouble();
			
			System.out.println("4.Student name");
			String name4 = sc.next();
			
			System.out.println("4.Student surname");
			String surname4 = sc.next();
			
			System.out.println("4.Student grade");
			double grade4 = sc.nextDouble();
			
			System.out.println("5.Student name");
			String name5 = sc.next();
			
			System.out.println("5.Student surname");
			String surname5 = sc.next();
			
			System.out.println("5.Student grade");
			double grade5 = sc.nextDouble();
			
			System.out.println("Now system is calculating the sum of grades");
			double total = grade1 + grade2 + grade3 + grade4 + grade5;
			
			System.out.println("Sum of grades is:" + total);
	}
}
}