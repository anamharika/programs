package expection;

public class trycatch {

	public static void main(String[] args) {
		int i=80;
		int j=0;
		try {
			int x=i/j;
			
			
		}
		
		catch (Exception e) {
			System.out.println(e);
			
		}
		finally {
			 System.out.println(" the error is ended");	
			}
		

		
		System.out.println("----------------------");
		
		
		
		int a[]= {1,5,6,8};
		try {
			System.out.println(a[4]);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		finally {
			 System.out.println(" the error is ended");	
			}
				
		
		

	}

}
