package asdfg;

import java.util.Scanner;

public class emporer {
	public static void main(String[] args) {
		
		int b1,b2,h;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter b1 value");
		b1=scan.nextInt();
		System.out.println("enter b2 value"); 
		b2=scan.nextInt();
		System.out.println("enter h value");
		h=scan.nextInt();
		System.out.println(0.5*(b1+b2)*h);
	}
}
