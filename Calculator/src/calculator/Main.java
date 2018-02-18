package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
	   System.out.println("Enter your first number");
	         int a = sc.nextInt();
	   System.out.println("Enter your second number");
	         int b = sc.nextInt();
	   System.out.println("Now the system calculate the sum");
	         int c = a + b;
	    
	         System.out.println("First number is: " + a);
	         System.out.println("Second number is: " + b);
	         System.out.println("Sum is: " + a);
	         
	   System.out.println("Enter your first number");
	         int ab = sc.nextInt();
	   System.out.println("Enter your second number");
	         int bc = sc.nextInt();
	   System.out.println("Now system calculate the difference");
	         int abc = ab - bc;
	         
	         System.out.println("First number is:" + ab);
	         System.out.println("Second number is:" + bc);
	         System.out.println("Difference is:" + ab);
	         
	   System.out.println("Enter your first number");
	         int firstNumber = sc.nextInt();
	   System.out.println("Choose your operation + or - ");
	         int secondNumber = sc.nextInt();
	   System.out.println("Now system is calculating");
	          int result = 0;
	          
	   if(operation.equals("+")) {
		   result = firstNumber + secondNumber;
	   } else if(operation.equals("-")) {
		   result = firstNumber - secondNumber;
	   }
	    System.out.println("First number is: " + firstNumber);
		System.out.println("Second number is: " + secondNumber);
		System.out.println("The result is: " + result);
	   
	   }
	
		
	   
		
	        
	         
		
