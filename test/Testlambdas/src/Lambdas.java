import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {
	
	public static void main(String[] args){
		String[] words = {"takahashi","takanashi","takakura","takayama","tanahashi"};
		//Arrays.sort(words,(first, second) -> Integer.compare(first.length(), second.length()));
		//Arrays.sort(words);
		//System.out.println(Arrays.toString(words));
		
		List<String> intList = new ArrayList<String>();
		for(String word : words){
			intList.add(word);
			System.out.println(word+",");
		}
		for(String printword : intList){
			System.out.print(printword+",");
		}
	}
}
