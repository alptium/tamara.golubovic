package gradebook;

import java.util.ArrayList;

public class SystemStudentReporter {

	
	public void report(ArrayList<Student> students) {
		printStudents(students);
		printGradeSum(students);
	}
	
	private void printStudents(ArrayList<Student> students) {
		System.out.println("Here is the list of all students and their grades:");
		
		for(Student student : students) {
			printStudent(student);
		}
	}
	
	private void printGradeSum(ArrayList<Student> students) {
		System.out.println("Now system is calculating the sum of grades");
		
		double total = 0;
		
		for(Student student : students) {
			double grade = student.getGrade();
			total = total + grade;
			printStudent(student);
		}
		
		System.out.println("Sum of grades is:" + total);	
	}
	
	private void printStudent(Student student) {
		System.out.println(student.getName() + " " + student.getSurname() + " " + student.getGrade());
	}
}
