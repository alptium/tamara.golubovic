package gradebook;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			StudentReader reader = new SystemStudentReader();
			// StudentReader reader = new FileStudentReader(Paths.get("C:\\asfsaf"), ",");
			
			SystemStudentReporter reporter = new SystemStudentReporter();
			
			ArrayList<Student> students = reader.read();
			reporter.report(students);
		} catch(Exception ex) {
			System.out.println("Error has occurred");
		}

	}
}