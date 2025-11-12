package asdfg;

public class palendrom {

	public static void main(String[] args) {
		int a,b,c,d=0;
		for(a=136,b=a;b>0;b=b/10)
		{
			c=b%10;
			d=d*10+c;
			
		}
		
		if(a==d)
			
		{
			System.out.println("palindrome");	
		}
		else {
			System.out.println("no palindrome");
		}

	}

}
