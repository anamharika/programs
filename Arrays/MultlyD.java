package Arrays;

public class MultlyD {

	public static void main(String[] args) {
		 int a[][] = {{2,3},{4,5},{3,4}};
		for(int i=0;i<a.length;i++)        //r=i
		{     
			for(int j=0;j<2;j++)     // c=j
			{  
				System.out.print(" "+a[i][j]); //a[0][0]=2,a[1][1]=3
			}
			System.out.println();
		}  
		
		
			
	}

}
   /*     j
       
   i   0   0 1 2 3 4
       
       1   2 4 5 8 2
       
       2   4 6 3 1 6 
            
       3   5 8 2 6 2   */
       




