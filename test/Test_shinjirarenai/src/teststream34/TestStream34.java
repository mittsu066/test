package teststream34;

import java.util.Optional;
import java.util.stream.Stream;

public class TestStream34 {
	public static void main(String[] args){
		Stream<Integer> stream = Stream.of(2,10);
		//stream.forEach(action -> System.out.println(action));
		foo(stream);
		
	}
	public static void foo(Stream<Integer> stream){
		Optional<Integer> option = stream.filter(x -> x<5).limit(3).max((x, y) -> x-y);
		System.out.println(option.get());
	}
}
