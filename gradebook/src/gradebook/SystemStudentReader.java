package gradebook;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemStudentReader implements StudentReader {
	
	public ArrayList<Student> read() {
		ArrayList<Student> students = new ArrayList<Student>();
		
		try(Scanner sc = new Scanner(System.in)) { 
			
			int i = 0;
			
			while(true) {
				int position = i + 1;
				Student student = readStudent(sc, position);
				students.add(student);
				
				System.out.println("Quit? y / n");
				String response = sc.next();
				
				if(response.equalsIgnoreCase("y")) {
					break;
				}
				
				i++;
			}
		}	
		
		return students;
	}
	
	private Student readStudent(Scanner sc, int position) {
		System.out.println(position + ". Student name");
		String name = sc.next();
		
		System.out.println(position + ". Student surname");
		String surname = sc.next();
		
		System.out.println(position + ". Student grade");
		double grade = sc.nextDouble();
		
		return new Student(name, surname, grade);
	}
}
