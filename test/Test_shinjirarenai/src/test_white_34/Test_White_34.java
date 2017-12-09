package test_white_34;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test_White_34 {
	public static void main(String[] args){
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(15);
		
//		Stream<Integer> stream = Stream.of(5,10,11);
		//stream.forEach(action -> System.out.println(action));
		foo(arrayList.stream());
	}
	public static void foo(Stream<Integer> stream){
		
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(15);
		arrayList.add(20);
		
		//System.out.println(stream.filter(x -> x < 5).limit(1).max((x, y) -> x-y));
		Optional<Integer> option = arrayList.stream().filter(x -> x > 5).limit(3).max((x, y) -> x-y);
		System.out.println(option.get());
	}
}
