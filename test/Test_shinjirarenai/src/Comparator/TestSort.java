package Comparator;

import java.util.Comparator;

public class TestSort implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		System.out.print(o1);
		System.out.print("-");
		System.out.print(o2);
		System.out.print("=");
		System.out.print(o1-o2);
		System.out.println("");
		return o1-o2;
	}

	
}
