package testpurple;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test26 {
	public static void main(String[] args){
		Predicate<? super String> f = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("x", s -> s + s);
		System.out.println(stream);
//		stream.limit(10).forEach(action -> {
//			System.out.println(action);
//		});
		boolean a = stream.limit(10).peek(c ->{System.out.println(c);}).allMatch(f);
		System.out.println(a);
	}
}
