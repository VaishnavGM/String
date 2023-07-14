package Vaish;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		int uppercase=0;
	int lowercase=0;
		int digits=0;
		int specialcharacter=0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the string");
				String s = Scan.nextLine();
				Scan.close();
	int totalchar=s.length();
	for(int i = 0;i<s.length();i++)
	{
		if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			lowercase++;
		}
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		{
			uppercase++;
		}
		if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			digits++;
		}
		else
		{
			specialcharacter++;
		}
		}
			System.out.println(uppercase);
			System.out.println(lowercase);
			System.out.println(specialcharacter);
			System.out.println(digits);
int upperp = (uppercase*100)/totalchar;
int lowerp = (lowercase*100)/totalchar;
int specialp = (specialcharacter*100)/totalchar;
int digitsp = (digits*100)/totalchar;
System.out.println(upperp);
System.out.println(lowerp);
System.out.println(specialp);
System.out.println(digitsp);
	}
	}


