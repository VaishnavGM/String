package Stringnew;

import java.util.Scanner;

public class Secondd {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = Scan.nextLine();
		System.out.println("enter the string");
		String n = Scan.nextLine();
		System.out.println(s.replaceAll(s,n));
		System.out.println(n.replaceAll(n,s));
		Scan.close();
			}

		
	

}
