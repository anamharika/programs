package packagepredefine;

import java.util.*;

public class predefind {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner (predefine class) System.in (constructor) // 
        System.out.println(" the old salary is = ");
        int old = scan.nextInt(); // nextint is predefine method//
        
        System.out.println(" the hike salary is =" );
        int hike = scan.nextInt();
        
        int present  = old+hike;
        System.out.println(" the total salary = "+present);
	}

}
