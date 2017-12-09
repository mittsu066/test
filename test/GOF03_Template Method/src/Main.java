public class Main{
	public static void main(String[] args){
		//Hを持ったCharDisplayのインスタンスを１個作る
		AbstractDisplay d1 = new CharDisplay('H');
		//"Hello,World."を持ったStringDisplayのインスタンスを１個作る
		AbstractDisplay d2 = new StringDisplay("Hwllo,World");
		//"こんにちわ。"を持ったStringDisplayのインスタンスを１個作る
		AbstractDisplay d3 = new StringDisplay("Hwllo,Tokyo&Akita");
		
		d1.display();
		d2.display();
		d3.display();
	}
}