package TestStream;

import java.util.*;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args){
		List<Book> b = Arrays.asList(
				new Book("Platimun:"),
				new Book("Gold:"),
				new Book("Silver"));
		Stream<Book> str = b.stream();
		str.map(a -> a.i).forEach(System.out::print);
	}
}
