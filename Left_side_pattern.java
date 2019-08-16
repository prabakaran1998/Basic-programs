package Programs;

import java.util.Scanner;

public class Left_Side_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--)
			{
				System.out.print(" ");
				}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			}
	}

}
