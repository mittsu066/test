package testpurple;

import java.util.stream.Stream;

public class Test30 {
	public static void main(String[] args) {
		Stream.generate(()-> "hello")
		.limit(5).filter(s -> s.length() > 3)
		.peek(x -> System.out.println(x + ""))
		.forEach(x -> System.out.println(x + ""));
	}
}
