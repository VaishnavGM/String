package Vaish;
import java.util.Arrays; 
class Test9 {

	public static void main(String[] args) {
int a[]= {1,2,1,2,5,6};
int b[] = a;
int c[] = new int[6];
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<i;j++)
	{
		if(a[i]==b[j])
		{
			c[i]=a[i];
		}
	}
}
System.out.println(Arrays.toString(c));



	}

}
