package stringinterview;

public class occurancestring {

	public static void main(String[] args) {
	 //	nnhggkktwcmnkkkkkkkkkkkkggggggggggggg //

	    String s ="nnhggkktwcmnkkkkkkkkkkkkggggggggggggg" ;
	    int count = 0;
	    for (int i=0;i<s.length();i++) {
	    	if(s.charAt(i)=='g') {
	    		count++;
	    	}
	    }
	    System.out.println("the g count is = " +count);
	}

}
