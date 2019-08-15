package Programs;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next().toLowerCase();
		String b=s.next().toLowerCase();
	//	String a1=a.toLowerCase();
		//String a2=b.toLowerCase();
		char ch[]=a.toCharArray();
		char ch1[]=b.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		a=new String(ch);
		b=new String(ch1);
		System.out.println((a.equals(b))?"yes":"No");	
        s.close();
	}

}
