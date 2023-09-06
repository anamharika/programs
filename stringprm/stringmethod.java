package stringprm;

public class stringmethod {

	public static void main(String[] args) {
		//Literal Declaration 
		String s1 = "hello world";
		System.out.println(" the s1 value is = " +s1);
		
		// new keyword Declaration 
		
		String s2 = new String(" Hellow world ");
		System.out.println(" the s2 value is = " +s2);
		
		//using CharAt method to set character at that index
		System.out.println(s1.charAt(3));
		
		//using length method to get character count
		System.out.println(s1.length());
		
		//using substring method to get value where we begin 
		System.out.println(s1.substring(6));
		
		//using substring method 2 parameter 
		System.out.println(s1.substring(3, 8));
		
		//using contains method it returns true or false
		System.out.println(s1.contains("heo"));
		
		//using equal method using to comparing to strings
		System.out.println(s1.equals(s2));
		
		//using isempty method
		System.out.println(s1.isEmpty());
		
		//using replace method 
		System.out.println(s1.replace('h', 'e'));
		
		//using equals ignorecass
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//using indexof method
		System.out.println(s1.indexOf('w'));
		
		//using touppercase method
		System.out.println(s1.toUpperCase());
		
		//using tolowercase method 
		System.out.println(s1.toLowerCase());
		

	}

}
