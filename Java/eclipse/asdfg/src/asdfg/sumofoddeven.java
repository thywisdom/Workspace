package asdfg;

import java.util.Scanner;

public class sumofoddeven {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
		
		int n;
		System.out.println("n=");
		n=scan.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			 if (i % 2 != 0) {
				 sum=sum+i;
			 }
		}
		System.out.println(sum);

	}



	}


