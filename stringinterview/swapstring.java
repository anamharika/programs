package stringinterview;

public class swapstring {

	public static void main(String[] args) {
	String s="java";
	String s1="harika";
	s=s+s1;
	s1=s.substring(0,(s.length()));
	s=s.substring(s1.length());
	System.out.println(s+" "+s1);
			
			
	}

}
