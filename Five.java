package Stringnew;

public class Five {

	public static void main(String[] args) {
String s = "vaishnav";
String v = s;
int temp = 0;
for(int i = 0;i<s.length();i++)
{
	for(int j=0;j<=i;j++)
	{
		if(s.charAt(i)==v.charAt(j))
		{
			temp++;
		}

}

}
System.out.println(temp);

	}

}
