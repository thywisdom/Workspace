package asdfg;

public class pattern123 {

	public static void main(String[] args) {
		for(int i=1,j=5;i<j;i++)
		{
			for(int k=j;k>i;k--)
			
		    {
		      System.out.print(" ");
		    }
			for(int k=1;k<=i;k++)
		    {
		      System.out.print("* ");
		    }
		      System.out.println();
		}
		for(int i=1,j=5;i<=j;i++)
		{
		    for(int k=1;k<i;k++)
		    {
		      System.out.print(" ");
		    }
		    for(int k=j;k>=i;k--)
		    {
		      System.out.print(" * ");
		    }
		      System.out.println();
		}



	}

}
