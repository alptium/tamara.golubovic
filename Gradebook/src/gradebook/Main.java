package gradebook;

public class Main {

	public static void main(String[] args) {
	
		String names[] = new String[5];
		String surnames[] = new String[5];
		Double grades[] = new Double[5];
   
		names[0] = "Dejan";
		names[1] = "Tijana";
		names[2] = "Milos";
		names[3] = "Irina";
		names[4] = "Maja";
 
		surnames[0] = "Petrovic";
		surnames[1] = "Mitrovic";
		surnames[2] = "Simic";
		surnames[3] = "Lukic";
		surnames[4] = "Kovacevic";
 
		grades[0] = 8.56;
		grades[1] = 7.96;
		grades[2] = 9.32;
		grades[3] = 6.59;
		grades[4] = 8.87;
 
		for(int i = 0; i < 5; i++) {
		System.out.println(names[i] + " " + surnames[i] + " " + grades[i]);
     }
     
		System.out.println("Now the system calculate the sum");
		double total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
  
		System.out.println("Sum of grades is:" + total);
  
	  		 
	}

}
