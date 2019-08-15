package Programs;

import java.util.Scanner;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		char c[]=a.toCharArray();
		String s1="";
		for(int i=0;i<c.length;i++) {
			String s2=String.valueOf(c[i]);
			if(!s1.contains(s2)) {
				s1+=c[i];
			}
			
		}
		System.out.println(s1);
	}

}
