package Programs;
import java.util.*;
public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner s=new Scanner(System.in);
        int d1 = 0, d2 = 0; 
		int n=s.nextInt();

			int a[][]=new int[n][n]; 
			//printing 2D array  
			for(int i=0;i<n;i++){  
			 for(int j=0;j<n;j++){  
				 a[i][j]=s.nextInt();
			 }
			    
			 }  
			for(int i=0;i<n;i++){  
				 for(int j=0;j<n;j++){  
					System.out.print(a[i][j]+" ");
				 }
				 System.out.println();
			}
			  for (int i = 0; i < n; i++) 
		        { 
		            d1 += a[i][i]; 
		            d2 += a[i][n-i-1]; 
		        } 
			  System.out.println(d1);
			  System.out.println(d2);

	}

}
