package Practicing;

public class Firstlandidgitsum {

	public static void main(String[] args) {
		/*String num="145";
		
		int first=num.charAt(0)-'0';
        int last=num.charAt(2)-'0';
        
        int sum=first+last;
        System.out.println( sum);*/
		
		int series=243;
		
		
		int Lastdigit=243%10;
		System.out.println("The lastnumber of the series is :" + Lastdigit);
		
	    int Firstdigit = series;
	    while(Firstdigit>=10)
	    {
	    	Firstdigit=Firstdigit/10;
	    }
	    System.out.println("The Firstdigit of the series is :" + Firstdigit);
	    int Sum=0;
	    Sum=Firstdigit+Lastdigit;
	    System.out.println("Total :" + Sum);
		
		 
        
	}

}
 