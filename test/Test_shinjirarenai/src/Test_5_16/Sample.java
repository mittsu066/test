package Test_5_16;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args){
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, 10));
		items.add(new Item(2, 30));
		items.add(new Item(2, 30));
		items.add(new Item(1, 30));
		Item i = items.stream().reduce(new Item(4, 0), 
										(i1, i2) -> {i1.qu += i2.qu;
										return new Item(i1.no, i1.qu);
		});
		items.add(i);
		items.stream().parallel().reduce((i1, i2) -> i1.qu > i2.qu ? i1 : i2)
		.ifPresent(System.out::println); //optionalクラスのifPresentメソッド（SE8で追加）。これでNullチェックをしている。
	}
}
