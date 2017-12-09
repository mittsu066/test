package serializable;

import java.io.Serializable;

public class Foo implements Serializable{
	transient String data = "taro";
	public void setData(String data){ this.data = data;}
	public String getData(){return data;}
	public Foo(){this.data = "hana";}
}
