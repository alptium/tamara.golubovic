package gradebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileStudentReader implements StudentReader {

	private Path path;
	private String delimiter;
	
	public FileStudentReader(Path path, String delimiter) {
		this.path = path;
		this.delimiter = delimiter;
	}
	
	public Path getPath() {
		return path;
	}
	
	public String getDelimiter() {
		return delimiter;
	}
	
	public ArrayList<Student> read() throws IOException {
		
		List<String> lines = Files.readAllLines(path);
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		for(String line : lines) {
			Student student = readStudent(delimiter, line);
			students.add(student);
		}
		
		return students;
	}
	
	private Student readStudent(String delimiter, String line) {
		String[] parts = line.split(delimiter);
		
		String name = parts[0];
		String surname = parts[1];
		double grade = Double.parseDouble(parts[2]);
		
		return new Student(name, surname, grade);
	}
}
