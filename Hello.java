package Vaish;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the string");
		String a = Scan.nextLine();
		Scan.close();
		StringBuilder sb = new StringBuilder(a);
		sb.reverse();
		System.out.println(sb);
	}

}
