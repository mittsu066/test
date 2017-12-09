public abstract class AbstractDisplay{ //抽象クラスAbstractDisplay
	
	public abstract void open(); //サブクラスに実装を任せる抽象メソッド１
	public abstract void print(); //サブクラスに実装を任せる抽象メソッド２
	public abstract void close(); //サブクラスに実装を任せる抽象メソッド３
	
	public final void display(){
		
		open();	//まずオープンする
		
		//for(int i =0; i<5; i++){	//5回printを繰り返す
			print();
		//}
		
		close();	//最後にクローズする。
	}//以上がdisplayメソッドで実装されている内容
}