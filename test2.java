package Vaish;
import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		int a[] = {1,3,2,5,8,0};
		Arrays.sort(a);
		int maximum = a[a.length-1];
		int minimum = a[0];
		System.out.println(maximum);
		System.out.println(minimum);

	}

}
