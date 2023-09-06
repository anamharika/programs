package Inheritance;


class A {                   // parent class
	public void a1() {
		System.out.println(" am a1");
	}
}

class B  extends A {                   // child class
	public void a1() {
		System.out.println(" am b1");
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		
	/*	A a = new A();
		a.a1(); 
		a.b1();  */ // A class not access to B because A is parent B is child
		          // Child(B) is access to Parent (A) 
		System.out.println("----------------");
         B b = new B();
         b.a1();
         
	}

}
