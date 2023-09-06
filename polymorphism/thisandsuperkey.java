package polymorphism;
class A2 {
	int a = 1;  // super.a
	int b=90;
	int c=88;  //class variable
	
}
class A1 extends A2 {
	int a=2; //  this.a // Local variable
	int b=22;
	int c=888;
public void show() {
	int a=3;  //  normal a // local variable
	int b=20;
	int c=8;
	System.out.println(a+" "+b);
	System.out.println("------------");
	System.out.println(a);
    System.out.println(this.a);
    System.out.println(super.a);
    System.out.println("--------------");
    System.out.println(b);
    System.out.println(this.b);
    System.out.println(super.b);
    System.out.println("-------------");
    System.out.println(c);
    System.out.println(this.c);
    System.out.println(super.c);
	
}
}

public class thisandsuperkey {

	public static void main(String[] args) {
		A1 a = new A1();
		a.show();

	}

}
