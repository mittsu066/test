package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable implements Comparable<TestComparable>{
	
	private int no;
	private String name;
	
	TestComparable(int no,String name){
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(TestComparable tc) {
		// TODO Auto-generated method stub
		return this.compareTo(tc);
	}
	
	public String toString(){
		return no + ":" + name;
		
	}
	
	public static void main(String[] args){
		List<TestComparable> list = new ArrayList<TestComparable>();
		list.add(new TestComparable(4,"山本四郎"));
		list.add(new TestComparable(1,"山本太郎"));
		list.add(new TestComparable(3,"山本三郎"));
		list.add(new TestComparable(2,"山本二郎"));
		Collections.sort(list);
		for(TestComparable tc : list){
			System.out.println(tc + " ");
		}
	}
	
}
