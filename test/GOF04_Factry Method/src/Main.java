import framework.*;
import idcard.*;

public class Main{
	public static void main(String[] args){
		Factory factory = new IDCardFactory2();
		Product card1 = factory.create("高橋充");
		Product card2 = factory.create("高橋亮");
		Product card3 = factory.create("高橋絵里");
		card1.use();
		card2.use();
		card3.use();
	}
}