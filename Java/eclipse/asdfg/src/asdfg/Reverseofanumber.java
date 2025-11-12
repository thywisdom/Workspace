package asdfg;

public class Reverseofanumber {

	public static void main(String[] args) {
		int a,b,c,d=0;
		for(a=153,b=a;b>0;b=b/10)
		{
			c=b%10;//1
			d=d*10+c;//d=35*10+1=351
			
		}
		System.out.println(d);

	}

}
