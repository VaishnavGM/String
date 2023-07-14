package Stringnew;
import java.util.Scanner;
public class One {

	public static void main(String[]args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the first string value");
		String s = Scan.nextLine();
		System.out.println("enter the first string value");
         String m = Scan.nextLine();
         System.out.println(s.equals(m));
         System.out.println(s.compareTo(m));
         System.out.println(s==m);

        
	}
}
