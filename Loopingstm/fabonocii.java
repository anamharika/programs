package Loopingstm;

public class fabonocii {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" ");    //0
		System.out.print(b+" ");    //1
		for(int i=3; i<=10;i++) {  
			c=a+b;               //  c=0+1 c+1
			System.out.print(c+" "); //c=1
			a=b;
			b=c;
		}
            
	}

}
