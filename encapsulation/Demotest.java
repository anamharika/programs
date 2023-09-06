package encapsulation;

public class Demotest {

	public static void main(String[] args) {
		Demo d = new Demo();  //object creation
		d.show();
		d.display();      //calling the method
		
		int n = d.id();
		System.out.println(" the id value is = " +n);
		
		int n1 = d.examfee();
		System.out.println(" the exam fee is =" +n1);
		
		d.callvalue(20);
	}

	

}
