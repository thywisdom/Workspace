package Practicing;

public class Splittingsentence {

	public static void main(String[] args) {
		
		 String a = "hariharan is working in this world with java in edu is of in";
	     String b="is";
	     String c="in";
	        
	        int startIndex = a.indexOf(b);
	        int endIndex = a.lastIndexOf(c)+c.length() ;
	        
	        System.out.println(a.substring(startIndex, endIndex));
	}
		

}


