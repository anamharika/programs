package encapsulation;

public class Demo {
	
	public void show() {
		System.out.println(" i'm the show method ");
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(" the show value = "+c);
		
		
	}
	 public void display() {
		 System.out.println("am the display method ");
	 }
	

	 
	 
	 public int id() {
		 int i = 8;
		 return i;   // return type
		 
	 }
	 
	 public int examfee() {
		 return 100;
	 }

	 public void callvalue(int i) {   
		 System.out.println(" the callvalue is =" +i);
	 
		 
	 }
	}


