package Inheritance;

class X {
	public void x1() {
		System.out.println(" am x1 ");
	}
}
class Y extends X {
	public void Y1() {
		System.out.println(" am y1 ");
	}
} 
class Z extends Y {
	public void z1() {
      System.out.println(" am zde1 ");
	}
}


public class multi_levelinhertance {

	public static void main(String[] args) {

       X x= new X();
       x.x1();
       System.out.println("-------------");
       
       Y y = new Y();
       y.Y1();
       y.x1();
       
       System.out.println("--------------");
       
       Z z = new Z();
       z.x1();
       z.Y1();
       z.z1();
	}

}
