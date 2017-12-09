import java.util.ArrayList;

public class Enhanced_For_Loop{
	
	private ArrayList<String> fruits;

	public void init(){
	fruits = new ArrayList();
	fruits.add("りんご");
	fruits.add("みかん");
	fruits.add("バナナ");
	//}
	
	//public void print(){
    //for(変数型 1要素を格納する変数 : Iterableを実装したオブジェクト)
    for(String s : fruits){
        System.out.println(s);
    }
	}
}
