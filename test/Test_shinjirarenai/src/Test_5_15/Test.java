package Test_5_15;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Test {
	public static void main(String[] args){
		List<Employee> emp = Arrays.asList(
				new Employee("101","Duke","Tokyo"),
				new Employee("102","Java","Osaka"),
				new Employee("103","Gold","Tokyo"),
				new Employee("104","Java","Osaka"),
				new Employee("105","Namahage","Akita"),
				new Employee("106","Hachi","Akita"),
				new Employee("107","Java","Osaka"),
				new Employee("108","Java","Osaka"));
		
		emp.stream()
		.collect(Collectors.groupingBy(Employee::getLoc)) //グルーピングをする
		.forEach((src, res) -> System.out.println(res)); //srcがloc,resがエレメント　MapのforEach
	}
}
