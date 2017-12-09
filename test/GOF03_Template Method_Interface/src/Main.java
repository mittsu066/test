public class Main{
	public static void main(String[] args){
		//Hを持ったCharDisplayのインスタンスを１個作る
		CharDisplay d1 = new CharDisplay('H');
		//"Hello,World."を持ったStringDisplayのインスタンスを１個作る
		StringDisplay d2 = new StringDisplay("Hwllo,World");
		//"こんにちわ。"を持ったStringDisplayのインスタンスを１個作る
		StringDisplay d3 = new StringDisplay("Hwllo,Tokyo&Akita");
		
		d1.open();
		d1.print();
		d1.close();
		
		d2.open();
		d2.print();
		d2.close();
		
		d3.open();
		d3.print();
		d3.close();
	}
}