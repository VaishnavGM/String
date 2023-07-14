package Stringnew;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Thilagaraj";
		String s2="";
		StringBuilder sb=new StringBuilder(s1);
		for(int i=s1.length();i>0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}

}
