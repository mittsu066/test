import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test_p_32 {
	public static void main(String[] args){
		Stream<String> stream1 = Stream.of("a","b","c");
		Stream<String> stream2 = Stream.of("a","b","c");
		Map<Boolean, List<String>> map1 = stream1.collect(Collectors.partitioningBy(s -> s.startsWith("a")));
		Map<Boolean, List<String>> map2 = stream2.collect(Collectors.groupingBy(s -> s.startsWith("a")));
		System.out.println(map1 + " " + map2);
	}
}
