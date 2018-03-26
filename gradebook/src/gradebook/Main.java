package gradebook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) { 
			
			ArrayList<Student> students = new ArrayList<Student>();
			
			int numStudents = 1000;
			
			for(int i = 0; i < numStudents; i++) {
				int position = i + 1;
				Student student = readStudent(sc, position);
				students.add(student);
			}
			
			System.out.println("Here is the list of all students and their grades:");
			
			for(Student student : students) {
				printStudent(student);
			}
			
			System.out.println("Now system is calculating the sum of grades");
			
			double total = 0;
			
			for(Student student : students) {
				double grade = student.getGrade();
				total = total + grade;
				printStudent(student);
			}
			
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