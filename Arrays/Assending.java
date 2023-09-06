package Arrays;

public class Assending {

	public static void main(String[] args) {
		int a[]= {4,2,6,7,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int b;
				if(a[i]>a[j]) {
					b = a[i];
					a[i]=a[j];
					a[j]=b;
				
				}
				
			}
			System.out.println(a[i]);	 
		}
		

	}

}
