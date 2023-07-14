package Stringnew;
public class Vowels {
public static void main(String[]args)
{
	
	String s = "Ram-age is 12@";
	int lower=0;
	int upper=0;
	int special=0;
	int number = 0;
	int space = 0;
int vowel = 0;
	String v = "aeiou";
	for(int i =0;i<s.length();i++)
	{
		
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowel++;
				
			}
		}

		for(int k = 0;k<s.length();k++)
		{

			if(s.charAt(k)>='0'&&s.charAt(k)<='9')
{
				number++;
}
			 if(s.charAt(k)>='a'&&s.charAt(k)<='z')
			{
				lower++;
			}

			 if(s.charAt(k)>='A'&&s.charAt(k)<='Z')
			{
upper++;
		}
			 if (s.charAt(k)==' ')
			{
				space++;
			}
		
			 else	
			{
				special++;
			}
}
	
		System.out.println(vowel);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(special);
		System.out.println(space);
		System.out.println(number);



}
}



     