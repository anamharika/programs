package polymorphism;

class additional {
	
	
	//  changing the number of argument 
	
   public void add() {
	   System.out.println(" no value");
   }
   
   // changing the data type
   
   public void add(char l, int k) {
	   System.out.println(" the additional value =" +(l+k));
	   
   }
   
   public void add(int i, int j ) { 
	   System.out.println(" the additional value =" +(i+j));
	   
   }
}


public class methodoverloading {

	public static void main(String[] args) {
		additional ad = new additional();
		ad.add();
		ad.add(10,20);
		ad.add('a', 10);

	}

}
