package Arrays;


public class SingleDarray {

	public static void main(String[] args) {
	// Initialization array static

		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//random access
		
		System.out.println(a[3]);
		
		System.out.println("--------------");
  
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//  Initialization array in dynamic way
		
		int b[] = {20,30,40,50,60};
		
		// what is the total length of the array
		
	   System.out.println("the total length of the array = " +b.length);
		

	}

}
