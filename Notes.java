package Vaish;
import java.util.Arrays;
public class Notes {

	
	    public static void main(String[] args) {
	        String s = "aasderrttvs aaseb db";
	        char c[] = s.toCharArray();
	        Arrays.sort(c);
	        String n = new String(c);
	        String m = n.substring(2);
	        System.out.println(m);

	        int acount = 0;
	        int bcount = 0;
	        int dcount = 0;

	        for (int i = 0; i < m.length(); i++) {
	            if (m.charAt(i) == 'a') {
	                acount++;
	            } else if (m.charAt(i) == 'b') {
	                bcount++;
	            } else if (m.charAt(i) == 'd') {
	                dcount++;
	            }
	        }

	        System.out.println("Total count of 'a': " + acount);
	        System.out.println("Total count of 'b': " + bcount);
	        System.out.println("Total count of 'd': " + dcount);
	    }
	}
