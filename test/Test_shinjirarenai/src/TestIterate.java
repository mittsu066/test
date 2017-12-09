import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestIterate {
	public static void main(String[] args){
		Predicate<? super String> f = s -> s.length() > 3;
		
//		List<String> list = new ArrayList<>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		
//		list.stream().limit(10).forEach(action ->{
//			System.out.println("action:"+action);
//		});
		
		
		
		Stream<String> stream1 = Stream.iterate("x", s -> s + s);
		boolean a = stream1.noneMatch(f);
		
		Stream<String> stream2 = Stream.iterate("x", s -> s + s);
		stream2.limit(10).forEach(System.out::println);
//		boolean b = stream2.anyMatch(f);
		
//		System.out.println(a + " " + b);
	}
}
