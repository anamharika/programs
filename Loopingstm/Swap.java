package Loopingstm;

public class Swap {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		 // using 3rd variable we can swap
		
		System.out.println("before swapping a =" +a);
		System.out.println("before swapping b =" +b);
		int c;
		c=a;     // c=10		
		a=b;     // a=20
		b=c;     // b=10
		
		System.out.println("after swapping a =" +a);
		System.out.println("after swapping b =" +b);
		
		// using + & - operators
		
		a=a+b;  //a=10+20=30
		a=a-b;  //b=30-20=10
		b=a-b;  //a=30-10=20
		
		System.out.println("after swapping a =" +a);
		System.out.println("after swapping b =" +b);
		
		a=a*b;  //a=10*20=200
		b=a/b;  //b=200/20=10
		a=a/b;  //a=200/10=20
		

		System.out.println("after swapping a =" +a);
		System.out.println("after swapping b =" +b);
		
				
	}

}
