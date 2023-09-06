package encapsulation;

public class variableexample {
	
	double commanfee = 500.00;
	
	public void first() {
		
		double fee = 1500.00;
		double totalfee = commanfee+fee;
		
	System.out.println(" the first year commanfee = " +commanfee);
	System.out.println(" the first year fee = " +fee);
	System.out.println(" the first year total = " +totalfee);
	variable a = new variable();
	System.out.println("the value of int is =" +a);
	
	
	
	
		
	}
	 public void secnod() {
		 
		 double fee = 2000.00;
		 double partical = 200.00;
		 double totalfee = commanfee+fee+partical;
		 System.out.println(" the second year commanfee = " +commanfee);
		 System.out.println(" the second year fee = " +fee);
		 System.out.println(" the second year partical = " +partical);
		 System.out.println(" the second year total = " +totalfee);
	 }

}
