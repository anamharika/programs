package Arrays;

public class largest {

	public static void main(String[] args) {
		int a[]= {3,5,8,9,4};
		int large = a[0];
		for (int i=0;i<=a.length-1;i++) {
			if(large<a[i]) {
				large = a[i];
			}
			
			
		}
		
		
		System.out.println(" the largest value = "+large);
	}

}

