package dsa;


import java.util.ArrayList;
import java.util.Collections;

public class ListA {
	

	public static void main(String[] args) {
		ArrayList<Integer> y=new ArrayList<Integer>();
		y.add(18);
		y.add(12);
		y.add(14);
		y.add(15);
		y.add(17);
		y.remove(2);
		System.out.println(y);
		System.out.println(y.get(2));
		System.out.println(y.size());
		y.add(2,18);
		System.out.println(y);
		y.set(2,19);
		System.out.println(y);
		Collections.sort(y);
		System.out.println(y);
		Collections.reverse(y);
		System.out.println(y);
		y.clear();
		System.out.println(y);


	}

}
