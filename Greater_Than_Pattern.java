package Programs;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+"");
			}
			n++;
			System.out.println();		
		}
		
		for(int i=n1-1;i>=1;i--){
			for(int j=1;j<=i;j++)
			{
				System.out.print(n-2+"");
				

			}
			n--;
			System.out.println();
		}
		
		

	}

}
