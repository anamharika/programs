package encapsulation;

public class variable {
	
	int i=10;  //class variable 
	int j;     //class variable without assign value
	public void a1() {
		int a =10;  //local variable
		int c;
		//  System.out.println(c); // value assigning is madidatory
		System.out.println(j);
		System.out.println(a);
	    System.out.println(i);
	    
	}
	
public void a2() {
	
	int b=20;
	System.out.println(b);
	System.out.println(i);  //class variable can access all method in class
	   // System.out.println(a);  // local variable can't access in other method
}
}
