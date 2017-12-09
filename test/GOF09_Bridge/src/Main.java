public class Main{
	public static void main(String[] args){
		CountDisplay d1 = new CountDisplay(new StringDisplayImpl("Hello, Japan."));
		//Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Tokyo."));
		Display d4 = new Display(new StringDisplayImpl("Hello, Akita."));
		//CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		CountDisplay d5 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		CountDisplay_MT d6 = new CountDisplay_MT(new StringDisplayImpl("Hello, MT."));
		d1.display();
		d2.display();
		d3.display();
		d4.display();
		d5.multiDisplay(5);
		d6.multiDisplay(2);
	}
}