package two;

public class Smallestolder {

	public static void main(String[] args) {
		int[] a= {12,5,6,7,8,8};
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(a[i]>a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;	
				}
				
			}
		}
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
	}



	}


