package Vaish;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);
System.out.println("enter the sting");
String s =Scan.nextLine();
Scan.close();
String s3="";
String[] s1 = s.split(" ");


	for(int i = 0;i<s1.length;i++)
	{
		s3 = s3+s1[i].substring(0,1).toUpperCase()+s1[i].substring(1)+" ";
	}
	System.out.println(s3);

}}
