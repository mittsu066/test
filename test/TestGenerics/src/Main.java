import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
        Container<Integer> container1 = new Container<Integer>(100);        //型変数T = Integer
        System.out.println("container1 is "+container1.get());              //メソッドgetの戻り値はInteger
        Container<String> container2 = new Container<String>("Generics");   //型変数T = String
        System.out.println("container2 is "+container2.get());              //メソッドgetの戻り値はString
        container1 = new Container<Integer>(200);
        System.out.println("container1 is "+container1.get()); 
        
        if("101".equals(Sports.BASEBALL.getCode()) ){
            System.out.println(Sports.BASEBALL.getName());
        }if("102".equals(Sports.SOCCER.getCode())){
            System.out.println(Sports.SOCCER.getName());
        }if("103".equals(Sports.TENNIS.getCode()) ){
            System.out.println(Sports.TENNIS.getName());
        }
        
        Enhanced_For_Loop EFL = new Enhanced_For_Loop();
        EFL.init();
	}
}
