import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add(2,"B");
		list.add("C");
		list.add("D");
		for(String str : list){
			System.out.print(str);
		}
	}
}

/*
//String型の代入は他のクラスとはちょっと違う。基本データ型っぽく作っているからってこと？
 * 
String[] str = {"AA","BB","CC","DD"};
str[1] = str[3];
String[] str2 = str;
str[3] = "XX";
for(String s : str){
	System.out.print(s + "");
}

Object[] obj = {str[0],str[1],str[2],str[3]};
obj[1] = obj[3];
Object[] obj2 = obj;
obj[3] = "XX";
for(Object o : obj){
	System.out.print(o + "");
}
*/


/*
import java.util.*;
import java.util.function.*;
public class Main{
	public static void main(String[] args){
		Customer c1 = new Customer("AAA", 500);
		Customer c2 = new Customer("BBB", 300);
		List<Customer> list = Arrays.asList(c1,c2);
		//func(list,(Customer c) -> c.getPoint() < 500);
		func(list,(Customer c) -> c.getPoint() < 600);
	}
	public static void func(List<Customer> list,Predicate<Customer> p){
		for(Customer c : list){
			if(p.test(c)){ //cの値と同じ場合にtrue
				System.out.println(c.getName());
			}
		}
	}
}
class Customer{
	private String name;
	private int point;
	
	public Customer(String name, int point){
		this.name = name;
		this.point =point;
	}
	public String getName(){
		return this.name;
	}
	public int getPoint(){
		return this.point;
	}
}*/
