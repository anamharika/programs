package stringinterview;

public class palindramstring {
 public static void main(String[] args) {
      String s = "sos";
      String palin ="";
      for (int i = s.length()-1;i>=0;i--) {
    	  palin=palin+s.charAt(i);
    	  
      }
      if (s.equals(palin)) {
    	  System.out.println("strint id palin");
      }
      else {
    	  System.out.println("not a palin");
      }
}
}
