package idcard;
import framework.*;

public class IDCard extends Product{
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "カードを作ります。");
		this.owner = owner;
	}
	
	public void use(){
		System.out.println(owner + "カードを使います。");
	}
	public String getOwner(){
		return owner;
	}
}