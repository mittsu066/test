package testpurple;

import java.util.stream.Stream;

public class test25 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", s -> s + "b");
		stream.limit(10).map(x -> x + "x").forEach(action -> {
//		stream.limit(10).forEach(action -> {
			System.out.print(action);
		});
	}
}
