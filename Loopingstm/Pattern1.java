package Loopingstm;

public class Pattern1 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= 6; j++) {
                if(j==i||j==6||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
  
            // printing new line for each row
            System.out.println();
        }
  
        // Printing the lower part
        for (int i = 6 - 1; i >= 1; i--) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= 6; j++) {
                if( j==i||j==6||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // printing new line for each row
            System.out.println();
        }
	}
}
      
	

	
	
