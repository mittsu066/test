public class CountDisplay_MT extends Display{
	public CountDisplay_MT(DisplayImpl impl){
		super(impl);
	}
	public void multiDisplay(int times){
		open();
		for(int i = 0; i < times; i++){
			print();
		}
		close();
	}
}