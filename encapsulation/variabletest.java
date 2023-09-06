package encapsulation;

public class variabletest {
	public static void main(String[] args) {
		variable v =new variable();
		
		System.out.println(v.i);
		System.out.println(v.j);
		
		System.out.println("----------------");
		
		v.a1();
		System.out.println("----------");
		
		v.a2();
		
		System.out.println("---------------");
		variableexample ve = new variableexample();
		
		System.out.println("the commanfee of the clg = " +ve.commanfee);
		System.out.println("--------------------");
		ve.first();
		System.out.println("-----------------");
		ve.secnod();
		
	}
	

}
