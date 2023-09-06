package stringinterview;

public class vowelstring {

	public static void main(String[] args) {
		String s = "harikasripathi";
				int v=0;
				for(int i=0;i<s.length();i++) {
					if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='0'||s.charAt(i)=='u') {
						v++;
					}
				}
				System.out.println("the vowel is = "+v);
	}

}
