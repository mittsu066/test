package Test_5_15;

public class Employee {
	String id, name, loc;
	public Employee(String id, String name, String loc){
		this.id = id;
		this.name = name;
		this.loc = loc;
	}
	public String getLoc(){
		return loc;
	}
	public String toString(){
		return id + ":" + name + ":" + loc;
	}
}
