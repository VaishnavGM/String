package Stringnew;
import java.util.Scanner;
public class Four {

	public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);
System.out.println("enter first string");
String s1 = Scan.nextLine();
System.out.println("enter first string");
String s2 = Scan.nextLine();
Scan.close();

	int flength = s1.length();
	int slengths = s2.length();
	if(flength>slengths)
	{
		System.out.println(s1+"is maximum");
				
	}
	else
	{
		System.out.println(s2+"is maximum");

	}
	}
}
