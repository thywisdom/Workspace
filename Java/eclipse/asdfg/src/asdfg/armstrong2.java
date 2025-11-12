package asdfg;

public class armstrong2 {

	public static void main(String[] args) {
		for(int i=1,j=10000;i<=j;i++)
		{ 
			int a=i,b,c,d,g,s=0;
			for(c=0,b=a;b>0;b=b/10,c++)//1>0 1/10=0 c=4
			{}
			
			for(b=a;b>0;b=b/10)
			{
				d=b%10;//1 
				g=1;
				for(int f=1;f<=c;f++)
				{
					g=g*d;//g=1*5=5*5=25*5=125
				}
				s=s+g;//27+125+1=153
			}
			
			if(a==s)
			{
				System.out.println("arm strong "+a);
			}
		}
		
		
		
		
	}

}