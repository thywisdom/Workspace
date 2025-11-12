package asdfg;

public class spliting {

	public static void main(String[] args) {
		

		int a,b,c,d=0;
		for(a=153,b=a;b>0;b=b/10)
		{
			c=b%10;
			d=d+c;
			
		}
		System.out.println(d);



	}

}
