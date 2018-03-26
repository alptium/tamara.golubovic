package gradebook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) { 
			
			Student student1 = readStudent(sc, 1);
			Student student2 = readStudent(sc, 2);
			Student student3 = readStudent(sc, 3);
			Student student4 = readStudent(sc, 4);
			Student student5 = readStudent(sc, 5);
			
			System.out.println("Here is the list of all students and their grades:");
			
			printStudent(student1);
			printStudent(student2);
			printStudent(student3);
			printStudent(student4);
			printStudent(student5);
			
			System.out.println("Now system is calculating the sum of grades");
			double total = student1.getGrade() + student2.getGrade() + student3.getGrade() + student4.getGrade() + student5.getGrade();
			
			System.out.println("Sum of grades is:" + total);
		}
	}
	
	private static Student readStudent(Scanner sc, int position) {
		
		System.out.println(position + ". Student name");
		String name = sc.next();
		
		System.out.println(position + ". Student surname");
		String surname = sc.next();
		
		System.out.println(position + ". Student grade");
		double grade = sc.nextDouble();
		
		return new Student(name, surname, grade);
	}
	
	private static void printStudent(Student student) {
		System.out.println(student.getName() + " " + student.getSurname() + " " + student.getGrade());
	}
}