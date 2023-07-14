package Stringnew;



public class Methods {

	public static void main(String[] args) {
		String s1 = new String("vaishnav");
		String s2 = "vAishnav";
		String s3 = " sat nav ";
		System.out.println(s1.length());
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.startsWith("V"));
	System.out.println(s1.startsWith("A",1));
	System.out.println(s1.endsWith("v"));
	System.out.println(s1.endsWith("a"));
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s1.indexOf("a"));
	System.out.println(s1.lastIndexOf("a"));
	System.out.println(s1.charAt(0));
	System.out.println(s3.substring(5));
	System.out.println(s3.substring(4,6));
	System.out.println(s3.trim());
	System.out.println(s3.strip());
	System.out.println(s2.replace("a","e"));
	
	}

	

}
