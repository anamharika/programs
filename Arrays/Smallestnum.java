package Arrays;

public class Smallestnum {

	public static void main(String[] args) {
		
		int a[]= {3,5,8,9,4};
		int small = a[0];
		for (int i=0;i<=a.length-1;i++) {
			if(small>a[i]) {
				small = a[i];
			}
			
			
		}
		
		
		System.out.println(" the smallest value = "+small);
	}

}



