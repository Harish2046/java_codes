package self;
import java.util.*;
public class String_Split {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] a=s.split(" ");
		for(String c:a){
			System.out.println(c);
		}
		sc.close();
	}
}
