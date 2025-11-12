package asdfg;

import java.util.Scanner;

public class arrayeven {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int[]a=new int[5];
		System.out.println("Even Numbers");
		int i;
		for(i=0;i<5;i++) {
			a[i]=scan.nextInt();		
			}
		for(i=0;i<5;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}

	}

}
