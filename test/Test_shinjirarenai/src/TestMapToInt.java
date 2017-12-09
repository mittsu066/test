import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestMapToInt {
	public static void main(String[] args){
		Stream<Integer> stream = Stream.of(10);
		DoubleStream doubleStream = stream.mapToDouble(a -> a);
		Stream<Double> doubles = doubleStream.mapToObj(a->a);
		Stream<Integer> integers = doubles.map(a -> a.intValue());
		integers.forEach(a ->System.out.println(a));
	}
}
