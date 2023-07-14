package Vaish;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
String original = "php excercises and java program";
Scanner Scan = new Scanner(System.in);
System.out.println("enter checking string");
String s = Scan.nextLine();
System.out.println(original.contains(s));
	}

}
