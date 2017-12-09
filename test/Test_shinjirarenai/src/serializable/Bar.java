package serializable;

import java.io.Serializable;

public class Bar extends Foo implements Serializable {
	{
		this.data = "nao";
	}

	public Bar() {
		this.data = "kei";
//		System.out.println("data:"+this.data);
	}
}
