package asdfg;

import java.util.Scanner;

public class Hours {

	public static void main(String[] args) {
		int h,m;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value h");
		h=scan.nextInt();
		System.out.println("enter a value m");
		m=scan.nextInt();
		System.out.println(h*60+m);
	}

}
