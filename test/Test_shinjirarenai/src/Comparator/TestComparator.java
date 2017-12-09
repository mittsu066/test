package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	
	private Integer no;
	
	TestComparator(Integer no){
		this.no = no;
	}
	
	public static void main(String[] args){
	List<Integer> list = new ArrayList<>();
	list.add(2);
	list.add(3);
	list.add(1);
	list.add(4);
	Collections.sort(list,new TestSort());
		for(Integer i : list){
			System.out.println(i + " ");
		}
	}
}