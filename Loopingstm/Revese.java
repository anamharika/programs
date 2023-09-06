package Loopingstm;

public class Revese {

	public static void main(String[] args) {
		
		int a=329, rev=0, rem;
		while(a>0) {
			rem = a%10;
			rev = rev*10 + rem;
			a = a/10;
			
			
		}
		
		System.out.println(" Revese value = "+rev);
		

	}

}
